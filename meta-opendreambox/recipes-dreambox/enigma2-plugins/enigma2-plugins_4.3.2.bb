require enigma2-plugins.inc

SRCREV = "${@opendreambox_srcrev('e7eb41124ed1f29dc98b6b6c6c7cb1e70e1d3113', d)}"

SRC_URI_append_dreamone = " file://autores-e2-4.4.patch"

inherit opendreambox-github
