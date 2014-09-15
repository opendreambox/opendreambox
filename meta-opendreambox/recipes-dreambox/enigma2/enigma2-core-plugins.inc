SUMMARY_enigma2-plugin-extensions-browser = "Browse the web"
SUMMARY_enigma2-plugin-extensions-cutlisteditor = "Cut movies"
SUMMARY_enigma2-plugin-extensions-graphmultiepg = "Graphical program guide"
SUMMARY_engima2-plugin-extensions-hbbtv = "HbbTV functionality for your Dreambox (beta)"
SUMMARY_enigma2-plugin-extensions-modem = "Connect to the internet by modem"
SUMMARY_enigma2-plugin-extensions-pictureplayer = "Show photos"
SUMMARY_enigma2-plugin-systemplugins-cleanupwizard = "Detect low flash memory"
SUMMARY_enigma2-plugin-systemplugins-crashlogautosubmit = "Send crash logs to Dream Multimedia"
SUMMARY_enigma2-plugin-systemplugins-positionersetup = "Install a motorized dish"
SUMMARY_enigma2-plugin-systemplugins-satelliteequipmentcontrol = "Fine-tune DiSEqC settings"
SUMMARY_enigma2-plugin-systemplugins-satfinder = "Find satellites"
SUMMARY_enigma2-plugin-systemplugins-skinselector = "Select installed skins"
SUMMARY_enigma2-plugin-systemplugins-upnp = "UPnP tools based on python-coherence"
SUMMARY_enigma2-plugin-systemplugins-videomode = "Select custom video modes"

PACKAGES =+ " \
    enigma2-plugin-extensions-browser \
    enigma2-plugin-extensions-cutlisteditor \
    enigma2-plugin-extensions-dvdburn \
    enigma2-plugin-extensions-dvdplayer \
    enigma2-plugin-extensions-hbbtv \
    enigma2-plugin-extensions-modem \
    enigma2-plugin-systemplugins-commoninterfaceassignment \
    enigma2-plugin-systemplugins-crashlogautosubmit \
    enigma2-plugin-systemplugins-hotplug \
    enigma2-plugin-systemplugins-networkmanager \
    enigma2-plugin-systemplugins-softwaremanager \
    enigma2-plugin-systemplugins-upnp \
"

QT_BASE_NAME ?= "${@base_contains('DISTRO_FEATURES', 'x11', 'qt4', 'qt4-embedded', d)}"
QT_IMAGEFORMATS ?= "${QT_BASE_NAME}-plugin-imageformat-gif \
                    ${QT_BASE_NAME}-plugin-imageformat-ico \
                    ${QT_BASE_NAME}-plugin-imageformat-jpeg \
                    ${QT_BASE_NAME}-plugin-imageformat-svg \
                    ${QT_BASE_NAME}-plugin-imageformat-tiff"

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
        python-xml \
        python-imaging \
        ${@base_conditional('OPENDREAMBOX_GST_VERSION', '0.10', 'gst-plugins-bad-mpegtsmux', 'gstreamer1.0-plugins-bad-mpegtsmux', d)} \
        ${@base_conditional('OPENDREAMBOX_GST_VERSION', '0.10', 'gst-plugins-bad-videoparsersbad', 'gstreamer1.0-plugins-bad-videoparsersbad', d)} \
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
RDEPENDS_enigma2-plugin-systemplugins-hotplug = " \
        python-fcntl \
        python-threading \
"
RDEPENDS_enigma2-plugin-extensions-modem = " \
        dreambox-modem-ppp-scripts \
        ppp \
"
RRECOMMENDS_enigma2-plugin-extensions-modem = " \
        kernel-module-ppp-async \
        kernel-module-ppp-deflate \
        kernel-module-ppp-generic \
"
RDEPENDS_enigma2-plugin-systemplugins-networkmanager = " \
        packagegroup-net-connman \
"
RDEPENDS_enigma2-plugin-systemplugins-softwaremanager = " \
        python-twisted-web \
"
RDEPENDS_enigma2-plugin-systemplugins-upnp = " \
        python-coherence \
"

python populate_packages_prepend() {
    enigma2_plugindir = bb.data.expand('${libdir}/enigma2/python/Plugins', d)
    do_split_packages(d, enigma2_plugindir, '^(\w+/\w+)/[a-zA-Z0-9_]+.*$', 'enigma2-plugin-%s', '%s', recursive=True, match_path=True, prepend=True)
    do_split_packages(d, enigma2_plugindir, '^(\w+/\w+)/.*\.la$', 'enigma2-plugin-%s-dev', '%s (development)', recursive=True, match_path=True, prepend=True)
    do_split_packages(d, enigma2_plugindir, '^(\w+/\w+)/.*\.a$', 'enigma2-plugin-%s-staticdev', '%s (static development)', recursive=True, match_path=True, prepend=True)
    do_split_packages(d, enigma2_plugindir, '^(\w+/\w+)/(.*/)?\.debug/.*$', 'enigma2-plugin-%s-dbg', '%s (debug)', recursive=True, match_path=True, prepend=True)
}
