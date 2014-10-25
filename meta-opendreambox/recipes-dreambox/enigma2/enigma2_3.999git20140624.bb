SUMMARY_enigma2-plugin-systemplugins-minidlnasetup = "DLNA media server (minidlna)"
SUMMARY_enigma2-plugin-systemplugins-networkwizard = "General network settings"
SUMMARY_enigma2-plugin-systemplugins-wirelesslan = "Wireless network settings"
LIC_FILES_CHKSUM = "file://../LICENSE;md5=e943a2b66bda2bf828e561a3e6c7ecfc"
DEPENDS = " \
    freetype \
    fribidi \
    giflib \
    glib-2.0 \
    gstreamer \
    gst-plugins-base \
    libaio \
    libbluray \
    libdlsym \
    libdreamdvd \
    libdvbsi++ \
    libdvdnav \
    libdvdread \
    libjpeg-turbo \
    libpng12 \
    libsigc++-2.0 \
    libssl0.9.8 \
    libxml2 \
    libxmlccwrap \
    python \
    qt4-embedded \
"

SRC_URI = "http://dreamboxupdate.com/download/${DISTRO}/2.0.0/${PN}/${PN}_${PV}_${TUNE_PKGARCH}.tar.bz2;name=${TUNE_PKGARCH} \
           file://0001-HbbTV.py-fixed-UserAgent-handling.patch \
           file://opendreambox-2.2.patch \
           file://enigma2.service"
SRC_URI[mips32el.md5sum] = "721c54daffe174017ae5e8a2c6763249"
SRC_URI[mips32el.sha256sum] = "d2105f609bee374b2b324b33bc0eaba4a65b729a32b75a7ea06bdcf85c6151e6"

S = "${WORKDIR}/${PN}_${PV}_${TUNE_PKGARCH}"

do_install() {
    install -d ${D}${systemd_unitdir}/system
    install -m644 ${WORKDIR}/enigma2.service ${D}${systemd_unitdir}/system
    cp -r usr ${D}
}

PACKAGES =+ " \
    enigma2-plugin-systemplugins-minidlnasetup \
    enigma2-plugin-systemplugins-networksetup \
    enigma2-plugin-systemplugins-nfiflash \
    enigma2-plugin-systemplugins-wirelesslan \
"

RDEPENDS_${PN} += " \
    qnullscreen \
"
RDEPENDS_enigma2-plugin-systemplugins-minidlnasetup = " \
    minidlna \
"
RDEPENDS_enigma2-plugin-systemplugins-networksetup = " \
    ethtool \
    packagegroup-net-ifupdown \
"
RDEPENDS_enigma2-plugin-systemplugins-nfiflash = " \
    python-twisted-web \
"
RDEPENDS_enigma2-plugin-systemplugins-wirelesslan = " \
    python-stringold \
    python-wifi \
    wireless-tools \
    wpa-supplicant \
"

require enigma2-common.inc

COMPATIBLE_MACHINE = "^(dm500hd|dm500hdv2|dm800se|dm800sev2|dm7020hd|dm7020hdv2|dm8000)$"

INHIBIT_PACKAGE_STRIP = "1"
