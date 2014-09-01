PRECOMPILED_ARCH = "${@d.getVar('PV', True).split('-')[1]}"
PRECOMPILED_VERSION = "${@d.getVar('PV', True).split('-')[0]}"

SRC_URI = "http://sources.dreamboxupdate.com/download/7020/secondstage-${PRECOMPILED_ARCH}-${PRECOMPILED_VERSION}.bin"

S = "${WORKDIR}"

require dreambox-secondstage-base.inc
