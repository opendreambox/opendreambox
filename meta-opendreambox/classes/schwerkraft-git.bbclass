SRC_URI += "${SCHWERKRAFT_URI}"

inherit git-project

SCHWERKRAFT_BRANCH ?= ""
SCHWERKRAFT_PROJECT ?= "${BPN}"
GIT_URI="git://schwerkraft.elitedvb.net/${SCHWERKRAFT_PROJECT}/${SCHWERKRAFT_PROJECT}.git"
GIT_URI_BRANCH="git://schwerkraft.elitedvb.net/${SCHWERKRAFT_PROJECT}/${SCHWERKRAFT_PROJECT}.git;branch=${SCHWERKRAFT_BRANCH}"
SCHWERKRAFT_URI = "${@base_conditional('SCHWERKRAFT_BRANCH', '', '${GIT_URI}', '${GIT_URI_BRANCH}', d)}"
