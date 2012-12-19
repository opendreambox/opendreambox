S = "${WORKDIR}/git"

inherit gitpkgv

GIT_PV ?= "${SRCPV}"
RECIPE_PV := "${PV}"
PV = "${RECIPE_PV}+git${GIT_PV}"
PKGV = "${RECIPE_PV}+git${GITPKGV}"
