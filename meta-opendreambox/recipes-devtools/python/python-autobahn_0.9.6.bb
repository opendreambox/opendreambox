DESCRIPTION = "AutobahnPython provides a WebSocket (RFC6455, Hybi-10 to -17, Hixie-76) framework for creating WebSocket-based clients and servers. \
AutobahnPython also includes an implementation of WAMP (The WebSockets Application Messaging Protocol), a light-weight,  \
asynchronous RPC/PubSub over JSON/WebSocket protocol."
HOMEPAGE = "http://autobahn.ws/python"
SECTION = "console/network"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = " file://LICENSE;md5=2ee41112a44fe7014dce33e26468ba93"

SRC_URI = "https://pypi.python.org/packages/source/a/autobahn/autobahn-${PV}.tar.gz"
SRC_URI[md5sum] = "99d70138bf0a4e14818916144fd9e3db"
SRC_URI[sha256sum] = "7b17ea657ef275a361dba1977cdbfc822c664ef3fc8500c4b0d82cbf42854f9f"

S = "${WORKDIR}/autobahn-${PV}"

inherit setuptools

RDEPENDS_${PN} = "python python-pprint python-twisted-protocols python-netserver python-twisted-web python-six"

