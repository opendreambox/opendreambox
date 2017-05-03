SUMMARY = "Put hard drives into standby when shutting down the system"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8f242b441da515e30c7b07f2cc6f4d5c"

SRCREV = "${@opendreambox_srcrev('6072e2174619712a41f46ea007acf65fd0e86e48', d)}"

inherit opendreambox-git

rootlibexecdir = "${base_prefix}/lib/systemd"

do_install() {
    oe_runmake install DESTDIR="${D}" rootlibexecdir="${rootlibexecdir}"
}

FILES_${PN} += "${rootlibexecdir}"
