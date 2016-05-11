SUMMARY = "dreambox RTSP server"
SECTION = "multimedia"
LICENSE = "CC-BY-NC-SA-3.0 | DreamProperty"
LIC_FILES_CHKSUM = "file://COPYING;md5=d0bc37dd201603b26956a4e5f4a3601d"
DEPENDS = "gstreamer1.0 gstreamer1.0-plugins-base gstreamer1.0-plugins-bad gstreamer1.0-rtsp-server"
SRCREV = "cf4f76b8e14f8017189c1f16b43b63e0cf0f79b7"

inherit autotools opendreambox-git systemd

RDEPENDS_${PN} = "gst-plugin-dreamsource \
                  gstreamer1.0-plugins-bad-videoparsersbad \
                  gstreamer1.0-plugins-bad-mpegtsmux \
                  gstreamer1.0-plugins-base-app \
                  gstreamer1.0-plugins-good-audioparsers \
                  gstreamer1.0-plugins-good-rtp \
                  gstreamer1.0-plugins-good-rtpmanager \
                  gstreamer1.0-plugins-good-udp"

SYSTEMD_SERVICE_${PN} = "dreamrtspserver.service"

pkg_postinst_${PN} () {
if [ -z "$D" ]; then
    systemctl reload dbus
fi
}
