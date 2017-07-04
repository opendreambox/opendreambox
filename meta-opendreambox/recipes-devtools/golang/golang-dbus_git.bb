SUMMARY = "Native Go bindings for D-Bus"
HOMEPAGE = "https://${GO_SRCROOT}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://${GO_SRCROOT}/LICENSE;md5=09042bd5c6c96a2b9e45ddf1bc517eed"
SRCREV = "37252881b3a87eaa2eb04b0ff2211f54f45199ab"
RECIPE_PV := "${PV}"
PV = "${RECIPE_PV}+git${SRCPV}"

SRC_URI = "git://${GO_SRCROOT}"

inherit golang

GO_SRCROOT = "github.com/godbus/dbus"
