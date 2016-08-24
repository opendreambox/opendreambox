SRCREV = "${@opendreambox_srcrev('67bac1b8243362b8a49059ec98db20429155588a', d)}"
PV = "0.9.3"

require recipes-connectivity/qxmpp/qxmpp.inc

SRC_URI = "git://github.com/mtdcr/qxmpp-dev.git;branch=v0.9.3-dev"

inherit git-project opendreambox-srcrev
