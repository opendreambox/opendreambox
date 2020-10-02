require enigma2-plugins.inc

SRCREV = "${@opendreambox_srcrev('d3e20c2120290f85f34136841e95ec3ecf17090e', d)}"

inherit opendreambox-github

SRC_URI += "file://0001-Autoresolution-be-compatible-to-new-DisplayHardware-.patch \
            file://0002-Autoresolution-Properly-apply-special-frame-rate-mod.patch \
            file://0003-mytube-remove-tpm-check.patch \
            file://0004-webadmin-remove-remnants-of-tpm-check.patch \
            file://0005-yttrailer-remove-remnants-of-tpm-check.patch \
            file://0006-webinterface-remove-tpm-check.patch \
            file://0007-AutoResolution-fixed-wrongly-displayed-mode-after-au.patch \
"
