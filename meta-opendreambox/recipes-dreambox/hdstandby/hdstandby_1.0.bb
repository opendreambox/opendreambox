SUMMARY = "Put hard drives into standby when shutting down the system"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8f242b441da515e30c7b07f2cc6f4d5c"

SRCREV = "${@opendreambox_srcrev('470e7e87e7cb828c94b756f720fc4985edc5eee4', d)}"

inherit opendreambox-git

rootlibexecdir = "${base_prefix}/lib/systemd"

do_install() {
    oe_runmake install DESTDIR="${D}" rootlibexecdir="${rootlibexecdir}"
}

FILES_${PN} += "${rootlibexecdir}"
