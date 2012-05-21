SUMMARY = "The official Python interface to the Flickr API"
HOMEPAGE = "http://stuvel.eu/flickrapi"
SECTION = "devel/python"
LICENSE = "PSF"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d54e175a4083eea51ac31acaff818df5"
PRIORITY = "optional"
PR = "r3"

SRC_URI = "http://pypi.python.org/packages/source/f/flickrapi/flickrapi-${PV}.zip"
SRC_URI[md5sum] = "90dca08a45968b18da0894887f3e59b3"
SRC_URI[sha256sum] = "ac9304f571175b8af4fc2ee17d3e110847b526640665ca53d97bbf9df98329bc"

S = "${WORKDIR}/flickrapi-${PV}"

inherit distutils

# NOTE: the package only offers documentation as data, so fix the path here
# instead of trying to move all files retroactively.
DISTUTILS_INSTALL_ARGS += "--install-data=${D}/${docdir}/${PN}"

# NOTE: requires python-misc for webbrowser and subprocess as missing dependency of the webbrowser
RDEPENDS_${PN} = "\
  python-core \
  python-elementtree \
  python-logging \
  python-misc \
  python-netclient \
  python-subprocess \
  python-threading \
  python-xml \
"
