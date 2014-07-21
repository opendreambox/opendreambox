SRCREV = "11e6ccac4eadc92a4f6e98aa35bcdb9d4461ef90"
PV = "0.7.6"

require recipes-connectivity/qxmpp/qxmpp.inc

SRC_URI = "git://github.com/mtdcr/qxmpp-dev.git;branch=v0.7.6-dev"

inherit git-project
