FILESEXTRAPATHS_prepend := "${THISDIR}/${BPN}:"

SAMBA4_IDMAP_MODULES_append = ",!idmap_ad,!idmap_adex"

EXTRA_OECONF += "--without-ads --without-cluster-support"
