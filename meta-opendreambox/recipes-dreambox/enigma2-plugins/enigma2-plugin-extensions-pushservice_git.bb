SUMMARY = "A flexible event notification service. Never miss any free space warning, update or timer conflict."
HOMEPAGE = "https://github.com/betonme/e2openplugin-PushService"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://src/LICENSE;md5=b234ee4d69f5fce4486a80fdaf4a4263"
DEPENDS = "gettext-native"
SRCREV = "ef911c80d4a12c1498faa25aaabe4bc995fb8189"
PV = "0.6.4+git${SRCPV}"

SRC_URI = "git://github.com/opendreambox/e2openplugin-PushService.git"

S = "${WORKDIR}/git"

inherit autotools-brokensep

RDEPENDS_${PN} = " \
    enigma2-plugin-extensions-webinterface \
    python-xml \
    python-email \
    python-twisted-core \
    python-twisted-mail \
    python-twisted-names \
    python-twisted-protocols \
    python-twisted-web \
    python-pyopenssl \
    openssl \
    python-io \
"

require enigma2-plugin.inc
