BRANCH ?= "stblinux-${PV}-dream"

SRC_URI = " \
        git://git.opendreambox.org/git/linux-np.git;protocol=ssh;branch=${BRANCH} \
        file://defconfig \
"

S = "${WORKDIR}/git"

require linux-dreambox.inc
