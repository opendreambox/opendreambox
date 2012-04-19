PR .= "-dream1"

FILESEXTRAPATHS_prepend := "${THISDIR}/${P}:"

SRC_URI += "${@base_version_less_or_equal('DREAMBOX_KERNEL_VERSION', '2.6.18', 'file://disable-ubi.patch', '', d)}"
