SUMMARY = "Python Cloudflare Scraper"
HOMEPAGE = "https://github.com/Anorov/cloudflare-scrape"
SECTION = "devel/python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=93d4804f061e05530be1a85b24185408"
SRCREV = "0e39950301c6319475f3076dedfcee1a86cc7d8e"
PV = "1.8.0"

SRC_URI = "git://github.com/Anorov/cloudflare-scrape.git;protocol=https"

S = "${WORKDIR}/git/"

inherit setuptools

RDEPENDS_${PN} = "python-requests python-pyexecjs"

BBCLASSEXTEND = "native"
