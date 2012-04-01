S = "${WORKDIR}/git"

inherit gitpkgv

RECIPE_PV := "${PV}"
PV = "${RECIPE_PV}+gitr${SRCPV}"
PKGV = "${RECIPE_PV}+gitr${GITPKGV}"
