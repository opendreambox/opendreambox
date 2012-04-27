PR = "${INC_PR}.0"

inherit opendreambox-precompiled-binary

do_install() {
        cp -r usr ${D}
}

require enigma2-hbbtv-plugin.inc
