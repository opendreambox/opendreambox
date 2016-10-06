DESCRIPTION = "Transmission RPC is a python module that can communicate with the bittorrent client Transmission through json-rpc"
HOMEPAGE = "http://bitbucket.org/blueluna/transmissionrpc/wiki/Home"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README;endline=11;md5=ba338d8f04b2304a50cd1b22d9078167"

SRC_URI[md5sum] = "b2f918593e509f0e66e2e643291b436d"
SRC_URI[sha256sum] = "ec43b460f9fde2faedbfa6d663ef495b3fd69df855a135eebe8f8a741c0dde60"

inherit pypi setuptools

RDEPENDS_${PN} = "python-simplejson python-six"
