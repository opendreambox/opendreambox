PR = "${INC_PR}.0"

inherit opendreambox-precompiled-binary opendreambox-sysvinit

do_install() {
        cp -r * ${D}
}

require dbttcd.inc
