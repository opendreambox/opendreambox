require recovery.inc

SRCREV = "${@opendreambox_srcrev('f6d9de6dc38272d83f19f63afe874e1cb58a8c61', d)}"
SRCREV_dm520 = "${@opendreambox_srcrev('465ab0601a290079fbd3ecc3cabd25f84b5efb06', d)}"
SRCREV_dm820 = "${@opendreambox_srcrev('9919a65aeb1c7e6f54f6b6df21cb94354f611901', d)}"
SRCREV_dm900 = "${@opendreambox_srcrev('8a1b9e1b2cae707ef688456fc43e1d13d6ed64bf', d)}"
SRCREV_dm7080 = "${@opendreambox_srcrev('d04ef152c73dac9460a56503d81708eb4f6dcff2', d)}"

inherit opendreambox-git

BRANCH = "master"
BRANCH_dm520 = "dm520"
BRANCH_dm820 = "dm820"
BRANCH_dm900 = "dm900"
BRANCH_dm7080 = "dm7080"

COMPATIBLE_MACHINE = "^(dm520|dm820|dm900|dm7080)$"
