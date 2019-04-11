require enigma2-plugins.inc

SRCREV = "${@opendreambox_srcrev('e76c8a08451d2045c593df9e806ab54baa60f7fc', d)}"

inherit opendreambox-github

SRC_URI += "file://0001-Autoresolution-be-compatible-to-new-DisplayHardware-.patch \
            file://0002-Autoresolution-Properly-apply-special-frame-rate-mod.patch \
            file://0003-mytube-remove-tpm-check.patch \
            file://0004-webadmin-remove-remnants-of-tpm-check.patch \
            file://0005-yttrailer-remove-remnants-of-tpm-check.patch \
            file://0006-webinterface-remove-tpm-check.patch"
