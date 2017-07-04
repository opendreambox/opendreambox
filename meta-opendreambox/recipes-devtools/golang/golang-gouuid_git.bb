SUMMARY = "Go binding for libuuid"
HOMEPAGE = "https://${GO_SRCROOT}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${GO_SRCROOT}/COPYING;md5=ca5e62c85cdbdc6f66333cf0f6b4aed4"
SRCREV = "179d4d0c4d8d407a32af483c2354df1d2c91e6c3"
RECIPE_PV := "${PV}"
PV = "${RECIPE_PV}+git${SRCPV}"

SRC_URI = "git://${GO_SRCROOT}"

inherit golang

GO_SRCROOT = "github.com/nu7hatch/gouuid"
