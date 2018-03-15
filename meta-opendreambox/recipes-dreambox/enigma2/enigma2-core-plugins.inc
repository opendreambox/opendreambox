SUMMARY_enigma2-plugin-extensions-browser = "Browse the web"
SUMMARY_enigma2-plugin-extensions-cutlisteditor = "Cut movies"
SUMMARY_enigma2-plugin-extensions-graphmultiepg = "Graphical program guide"
SUMMARY_engima2-plugin-extensions-hbbtv = "HbbTV functionality for your Dreambox (beta)"
SUMMARY_enigma2-plugin-extensions-pictureplayer = "Show photos"
SUMMARY_enigma2-plugin-systemplugins-cleanupwizard = "Detect low flash memory"
SUMMARY_enigma2-plugin-systemplugins-crashlogautosubmit = "Send crash logs to Dream Multimedia"
SUMMARY_enigma2-plugin-systemplugins-devshell = "Interactive Python shell for debugging"
SUMMARY_enigma2-plugin-systemplugins-positionersetup = "Install a motorized dish"
SUMMARY_enigma2-plugin-systemplugins-remotecontrolselection = "Select the type of remote you're using"
SUMMARY_enigma2-plugin-systemplugins-satelliteequipmentcontrol = "Fine-tune DiSEqC settings"
SUMMARY_enigma2-plugin-systemplugins-satfinder = "Find satellites"
SUMMARY_enigma2-plugin-systemplugins-skinselector = "Select installed skins"
SUMMARY_enigma2-plugin-systemplugins-upnp = "UPnP tools based on python-coherence"
SUMMARY_enigma2-plugin-systemplugins-videomode = "Select custom video modes"
SUMMARY_enigma2-plugin-systemplugins-hdmicec = "HDMI CEC support"

PACKAGES =+ " \
    enigma2-plugin-extensions-browser \
    enigma2-plugin-extensions-cutlisteditor \
    enigma2-plugin-extensions-dvdburn \
    enigma2-plugin-extensions-dvdplayer \
    enigma2-plugin-extensions-hbbtv \
    enigma2-plugin-systemplugins-commoninterfaceassignment \
    enigma2-plugin-systemplugins-crashlogautosubmit \
    enigma2-plugin-systemplugins-devshell \
    enigma2-plugin-systemplugins-hotplug \
    enigma2-plugin-systemplugins-jsonapi \
    enigma2-plugin-systemplugins-networkmanager \
    enigma2-plugin-systemplugins-softwaremanager \
    enigma2-plugin-systemplugins-streamserver \
    enigma2-plugin-systemplugins-upnp \
    enigma2-plugin-systemplugins-hdmicec \
"

RDEPENDS_enigma2-plugin-extensions-browser = " \
        ca-certificates \
        python-email \
        python-sqlite3 \
        python-xml \
        qtbase-plugin-imageformats-qjpeg \
        qtbase-plugin-imageformats-qgif \
        qtbase-plugin-imageformats-qico \
        ubuntu-font-family \
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
        python-xml \
        python-imaging \
        gstreamer1.0-plugins-bad-mpegtsmux \
        gstreamer1.0-plugins-bad-videoparsersbad \
"
RDEPENDS_enigma2-plugin-extensions-dvdplayer = " \
        packagegroup-opendreambox-dvdplayer \
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
RDEPENDS_enigma2-plugin-systemplugins-devshell = " \
        python-twisted-conch \
"
RRECOMMENDS_enigma2-plugin-systemplugins-devshell = " \
        python-pydoc \
"
RDEPENDS_enigma2-plugin-systemplugins-hotplug = " \
        python-fcntl \
        python-threading \
"
RDEPENDS_enigma2-plugin-systemplugins-jsonapi = " \
        python-json \
"
RDEPENDS_enigma2-plugin-systemplugins-networkmanager = " \
        packagegroup-net-connman \
"
RPROVIDES_enigma2-plugin-systemplugins-networkmanager = " \
        enigma2-plugin-systemplugins-networksetup \
        enigma2-plugin-systemplugins-networkwizard \
        enigma2-plugin-systemplugins-wirelesslan \
"
RCONFLICTS_enigma2-plugin-systemplugins-networkmanager = " \
        enigma2-plugin-systemplugins-networksetup \
        enigma2-plugin-systemplugins-networkwizard \
        enigma2-plugin-systemplugins-wirelesslan \
"
RREPLACES_enigma2-plugin-systemplugins-networkmanager = " \
        enigma2-plugin-systemplugins-networksetup \
        enigma2-plugin-systemplugins-networkwizard \
        enigma2-plugin-systemplugins-wirelesslan \
"
RDEPENDS_enigma2-plugin-systemplugins-softwaremanager = " \
        python-twisted-web \
"
RDEPENDS_enigma2-plugin-systemplugins-streamserver = " \
        dreamliveserver \
"
RDEPENDS_enigma2-plugin-systemplugins-upnp = " \
        python-coherence \
"
RPROVIDES_enigma2-plugin-systemplugins-upnp = " \
        enigma2-plugin-systemplugins-minidlnasetup \
"
RCONFLICTS_enigma2-plugin-systemplugins-upnp = " \
        enigma2-plugin-systemplugins-minidlnasetup \
"
RREPLACES_enigma2-plugin-systemplugins-upnp = " \
        enigma2-plugin-systemplugins-minidlnasetup \
"

RCONFLICTS_enigma2-plugin-systemplugins-hdmicec = " \
        enigma2-plugin-systemplugins-advhdmi \
"
RREPLACES_enigma2-plugin-systemplugins-hdmicec = " \
        enigma2-plugin-systemplugins-advhdmi \
"

python populate_packages_prepend() {
    enigma2_plugindir = bb.data.expand('${libdir}/enigma2/python/Plugins', d)
    do_split_packages(d, enigma2_plugindir, '^(\w+/\w+)/[a-zA-Z0-9_]+.*$', 'enigma2-plugin-%s', '%s', recursive=True, match_path=True, prepend=True)
    do_split_packages(d, enigma2_plugindir, '^(\w+/\w+)/.*\.la$', 'enigma2-plugin-%s-dev', '%s (development)', recursive=True, match_path=True, prepend=True)
    do_split_packages(d, enigma2_plugindir, '^(\w+/\w+)/.*\.a$', 'enigma2-plugin-%s-staticdev', '%s (static development)', recursive=True, match_path=True, prepend=True)
    do_split_packages(d, enigma2_plugindir, '^(\w+/\w+)/(.*/)?\.debug/.*$', 'enigma2-plugin-%s-dbg', '%s (debug)', recursive=True, match_path=True, prepend=True)
}
