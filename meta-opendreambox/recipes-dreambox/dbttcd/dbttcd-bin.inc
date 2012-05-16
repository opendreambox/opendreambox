PR = "${INC_PR}.0"

inherit opendreambox-precompiled-binary

do_install() {
        cp -r * ${D}
}

require dbttcd.inc
