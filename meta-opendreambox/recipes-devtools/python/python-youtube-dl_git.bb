SUMMARY = "Download videos from youtube.com or other video platforms"
HOMEPAGE = "http://rg3.github.io/youtube-dl/"
SECTION = "devel/python"
LICENSE = "Unlicense"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7246f848faa4e9c9fc0ea91122d6e680"
DEPENDS = "libxml2"
SRCREV = "2014.12.16"

SRC_URI = "git://github.com/rg3/youtube-dl.git;protocol=git;branch=master"

S = "${WORKDIR}/git"

inherit setuptools

RDEPENDS_${PN} = "python-unixadmin python-subprocess python-email"
