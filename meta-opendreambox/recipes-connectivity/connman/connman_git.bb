require recipes-connectivity/connman/connman.inc

SRCREV = "f97980f9f5fbe8760d14b28375074062c1f8e446"
PV = "1.24+git${SRCPV}"

SRC_URI = "git://git.kernel.org/pub/scm/network/connman/connman.git \
           file://connman \
           file://connmand-env \
           file://replace-hardcode-and-add-EnvironmentFile-and-Wants.patch \
           file://connman-env.service"

S = "${WORKDIR}/git"
