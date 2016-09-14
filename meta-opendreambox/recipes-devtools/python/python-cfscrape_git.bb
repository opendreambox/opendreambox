## Warning: unknown variable/routine "GITHUB_BRANCH = "master""
SUMMARY = "Python Cloudflare Scraper"
HOMEPAGE = "https://github.com/Anorov/cloudflare-scrape"
SECTION = "devel/python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=93d4804f061e05530be1a85b24185408"
SRCREV = "c041e9c012081198abb9bf912bdcbef7b51da7d9"
PV = "1.6.6"

SRC_URI = "git://github.com/Anorov/cloudflare-scrape.git;protocol=https"

S = "${WORKDIR}/git/"

inherit setuptools

RDEPENDS_${PN} = "python-requests python-js2py"

BBCLASSEXTEND = "native"
