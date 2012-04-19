S = "${WORKDIR}/git"

inherit gitpkgv

RECIPE_PV := "${PV}"
PV = "${RECIPE_PV}+git${SRCPV}"
PKGV = "${RECIPE_PV}+git${GITPKGV}"
