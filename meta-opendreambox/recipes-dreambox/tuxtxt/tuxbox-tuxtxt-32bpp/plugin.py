from enigma import eConsoleAppContainer, iServiceInformation, fbClass, eRCInput, eDBoxLCD, getDesktop
from Screens.Screen import Screen
from Plugins.Plugin import PluginDescriptor
from os import symlink, mkdir, remove, rmdir, path

class ShellStarter(Screen):
	skin = """
		<screen position="1,1" size="1,1" title="TuxTXT" >
                </screen>"""
	faked_lcd = False

	def __init__(self, session, args = None):
		self.skin = ShellStarter.skin
		Screen.__init__(self, session)
		self.container=eConsoleAppContainer()
		self.container.appClosed.append(self.finished)
		self.runapp()

	def runapp(self):
		service = self.session.nav.getCurrentService()
		info = service and service.info()
		txtpid = info and "%d" %(info.getInfo(iServiceInformation.sTXTPID)) or ""

		stream = service and service.stream()
		demux = stream and stream.getStreamingData()
		demux = demux and demux.get("demux", -1)
		demux = demux > -1 and "%d" %(demux) or ""

		eDBoxLCD.getInstance().lock()
		eRCInput.getInstance().lock()
		fbClass.getInstance().lock()

		self.faked_lcd = not path.exists("/dev/dbox")
		if self.faked_lcd:
			mkdir("/dev/dbox")
			symlink("/dev/null", "/dev/dbox/lcd0")

		if self.container.execute("/usr/bin/tuxtxt " + demux + " " + txtpid):
			self.finished(-1)

	def finished(self,retval):
		fbClass.getInstance().unlock()
		eRCInput.getInstance().unlock()
		eDBoxLCD.getInstance().unlock()

		if self.faked_lcd:
			remove("/dev/dbox/lcd0")
			rmdir("/dev/dbox")

		#force redraw
		dsk = getDesktop(0)
		dsk.resize(dsk.size())

		self.close()

def main(session, **kwargs):
	session.open(ShellStarter)

def Plugins(**kwargs):
	return PluginDescriptor(name="TuxTXT", description="Videotext", where = PluginDescriptor.WHERE_TELETEXT, fnc=main)
