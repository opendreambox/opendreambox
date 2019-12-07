FILESEXTRAPATHS_prepend := "${THISDIR}/${BPN}:"

SRC_URI_append_meson64 += " file://asound.conf"

FILES_alsa-conf_append_meson64 = " ${sysconfdir}/asound.conf"

do_install_append_meson64() {
	install -d ${D}${sysconfdir}
	install -m 644 ${WORKDIR}/asound.conf ${D}${sysconfdir}/asound.conf
}
