SUMMARY = "The official Python interface to the Flickr API"
HOMEPAGE = "https://stuvel.eu/flickrapi"
LICENSE = "PSF"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d54e175a4083eea51ac31acaff818df5"

SRC_URI[md5sum] = "7bb4261460f01ea8128cda5916a4e706"
SRC_URI[sha256sum] = "8400d470698fb746ced5dbd5c5eea229c3a4df022333c54b111aef3c65785a2b"

inherit pypi setuptools

# NOTE: the package only offers documentation as data, so fix the path here
# instead of trying to move all files retroactively.
DISTUTILS_INSTALL_ARGS += "--install-data=${D}/${docdir}/${PN}"

# NOTE: requires python-misc for webbrowser and subprocess as missing dependency of the webbrowser
RDEPENDS_${PN} = "\
  python-core \
  python-logging \
  python-misc \
  python-netclient \
  python-subprocess \
  python-threading \
  python-xml \
"
