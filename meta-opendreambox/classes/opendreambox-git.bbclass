OPENDREAMBOX_PROJECT ?= "${BPN}"

OPENDREAMBOX_URI ?= "git://git.opendreambox.org/git/${OPENDREAMBOX_PROJECT}.git;protocol=git"
SRC_URI += "${OPENDREAMBOX_URI}"

inherit git-project
