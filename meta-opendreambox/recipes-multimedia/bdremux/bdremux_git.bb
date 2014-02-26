SUMMARY = "bdremux - a blu-ray movie stream remuxer"
SECTION = "multimedia"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=374d7e305a3d05bc98bec47c241f02af"
DEPENDS = "${@base_conditional('OPENDREAMBOX_GST_VERSION', '0.10', 'gstreamer', 'gstreamer1.0', d)}"
SRCREV = "${@base_conditional('OPENDREAMBOX_GST_VERSION', '0.10', '0e79ef388600acca139ee4f48ccfe02e5adcbc4a', '8bf413af5673ca77dee4b077562176eddc15e668', d)}"

SRC_URI_append = ";branch=${@base_conditional('OPENDREAMBOX_GST_VERSION', '0.10', 'master', 'gst_1.0', d)}"

inherit autotools opendreambox-git
