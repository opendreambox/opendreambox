SRCREV = "1223d2541ef174556a0939e59efd65d05e1a3099"
PV = "0.4.0"

require recipes-connectivity/qxmpp/qxmpp.inc

SRC_URI = "git://github.com/mtdcr/QXmpp.git;protocol=git"

inherit git-project
