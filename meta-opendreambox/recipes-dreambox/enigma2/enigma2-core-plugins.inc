SUMMARY_enigma2-plugin-extensions-browser = "Browse the web"
SUMMARY_enigma2-plugin-extensions-cutlisteditor = "Cut movies"
SUMMARY_enigma2-plugin-extensions-graphmultiepg = "Graphical program guide"
SUMMARY_engima2-plugin-extensions-hbbtv = "HbbTV functionality for your Dreambox (beta)"
SUMMARY_enigma2-plugin-extensions-modem = "Connect to the internet by modem"
SUMMARY_enigma2-plugin-extensions-pictureplayer = "Show photos"
SUMMARY_enigma2-plugin-systemplugins-cleanupwizard = "Detect low flash memory"
SUMMARY_enigma2-plugin-systemplugins-crashlogautosubmit = "Send crash logs to Dream Multimedia"
SUMMARY_enigma2-plugin-systemplugins-minidlnasetup = "DLNA media server (minidlna)"
SUMMARY_enigma2-plugin-systemplugins-networkwizard = "General network settings"
SUMMARY_enigma2-plugin-systemplugins-positionersetup = "Install a motorized dish"
SUMMARY_enigma2-plugin-systemplugins-satelliteequipmentcontrol = "Fine-tune DiSEqC settings"
SUMMARY_enigma2-plugin-systemplugins-satfinder = "Find satellites"
SUMMARY_enigma2-plugin-systemplugins-skinselector = "Select installed skins"
SUMMARY_enigma2-plugin-systemplugins-upnp = "UPnP tools based on python-coherence"
SUMMARY_enigma2-plugin-systemplugins-videomode = "Select custom video modes"
SUMMARY_enigma2-plugin-systemplugins-wirelesslan = "Wireless network settings"

QT_IMAGEFORMATS ?= "qt4-embedded-plugin-imageformat-gif \
                    qt4-embedded-plugin-imageformat-ico \
                    qt4-embedded-plugin-imageformat-jpeg \
                    qt4-embedded-plugin-imageformat-svg \
                    qt4-embedded-plugin-imageformat-tiff"

RDEPENDS_enigma2-plugin-extensions-browser = " \
        ca-certificates \
        python-email \
        python-sqlite3 \
        python-xml \
        ubuntu-font-family \
        ${QT_IMAGEFORMATS} \
"
RDEPENDS_enigma2-plugin-extensions-cutlisteditor = " \
        aio-grab \
"
RDEPENDS_enigma2-plugin-extensions-dvdburn = " \
        bdremux \
        cdrkit \
        dvdauthor \
        dvd+rw-tools \
        mjpegtools \
        projectx \
        python-xml \
        python-imaging \
        gst-plugins-bad-videoparsersbad \
        gst-plugins-bad-mpegtsmux \
"
RDEPENDS_enigma2-plugin-extensions-hbbtv = " \
        enigma2-plugin-extensions-browser \
        enigma2-hbbtv-plugin\
"
RDEPENDS_enigma2-plugin-systemplugins-commoninterfaceassignment = " \
        python-xml \
"
RDEPENDS_enigma2-plugin-systemplugins-crashlogautosubmit = " \
        python-compression \
        python-email \
        python-mime \
        python-twisted-mail \
        python-twisted-names \
"
RDEPENDS_enigma2-plugin-systemplugins-hotplug = " \
        python-fcntl \
        python-threading \
"
RDEPENDS_enigma2-plugin-systemplugins-minidlnasetup = " \
        minidlna \
"
RDEPENDS_enigma2-plugin-extensions-modem = " \
        dreambox-modem-ppp-scripts \
        ppp \
"
RDEPENDS_enigma2-plugin-systemplugins-networksetup = " \
        ethtool \
"
RDEPENDS_enigma2-plugin-systemplugins-nfiflash = " \
        python-twisted-web \
"
RDEPENDS_enigma2-plugin-systemplugins-softwaremanager = " \
        python-twisted-web \
"
RDEPENDS_enigma2-plugin-systemplugins-upnp = " \
        python-coherence \
"
RDEPENDS_enigma2-plugin-systemplugins-wirelesslan = " \
        python-stringold \
        python-wifi \
        wireless-tools \
        wpa-supplicant \
"

python populate_packages_prepend() {
        enigma2_plugindir = bb.data.expand('${libdir}/enigma2/python/Plugins', d)
        do_split_packages(d, enigma2_plugindir, '^(\w+/\w+)/[a-zA-Z0-9_]+.*$', 'enigma2-plugin-%s', '%s', recursive=True, match_path=True, prepend=True)
        do_split_packages(d, enigma2_plugindir, '^(\w+/\w+)/.*\.la$', 'enigma2-plugin-%s-dev', '%s (development)', recursive=True, match_path=True, prepend=True)
        do_split_packages(d, enigma2_plugindir, '^(\w+/\w+)/.*\.a$', 'enigma2-plugin-%s-staticdev', '%s (static development)', recursive=True, match_path=True, prepend=True)
        do_split_packages(d, enigma2_plugindir, '^(\w+/\w+)/(.*/)?\.debug/.*$', 'enigma2-plugin-%s-dbg', '%s (debug)', recursive=True, match_path=True, prepend=True)
}
