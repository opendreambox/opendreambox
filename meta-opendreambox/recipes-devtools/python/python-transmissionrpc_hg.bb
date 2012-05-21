DESCRIPTION = "Transmission RPC is a python module that can communicate with the bittorrent client Transmission through json-rpc"
HOMEPAGE = "http://bitbucket.org/blueluna/transmissionrpc/wiki/Home"
SECTION = "devel/python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=725cfd8eb1ec903074184b7edf9379c9"
SRCREV = "4fe71eb818d0"
PV = "0.7+hg${SRCREV}"
PRIORITY = "optional"
PR = "r1"

SRC_URI = "hg://bitbucket.org/blueluna;proto=http;module=transmissionrpc;rev=${SRCREV}"

S = "${WORKDIR}/transmissionrpc"

inherit setuptools

RDEPENDS_${PN} = "python-simplejson"
