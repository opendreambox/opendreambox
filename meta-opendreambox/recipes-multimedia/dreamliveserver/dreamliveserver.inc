SUMMARY = "dreambox live server"
SECTION = "multimedia"
LICENSE = "CLOSED"
DEPENDS = "live555 systemd libsigc++-2.0"

inherit systemd

SYSTEMD_SERVICE_${PN} = "dreamliveserver.service dreamliveserver.socket"

FILES_${PN} += "${datadir}/dbus-1/system-services/de.dreambox.liveserver.service"

pkg_postinst_${PN} () {
if [ -z "$D" ]; then
    systemctl reload dbus
fi
}
