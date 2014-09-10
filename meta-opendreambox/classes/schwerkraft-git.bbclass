SRC_URI += "${SCHWERKRAFT_URI}"

inherit git-project

GIT_BRANCH ?= ""
SCHWERKRAFT_PROJECT ?= "${BPN}"
SCHWERKRAFT_URI = "git://schwerkraft.elitedvb.net/${SCHWERKRAFT_PROJECT}/${SCHWERKRAFT_PROJECT}.git;protocol=git;branch=${GIT_BRANCH}"
