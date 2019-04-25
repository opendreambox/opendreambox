SUMMARY = "MSNWeather Converter and Renderer to display MSN-Weather in Skin"
LICENSE = "DreamProperty"
LIC_FILES_CHKSUM = "file://Components/WeatherMSN.py;beginline=8;endline=21;md5=d5c1836fd7c355c994e00d27c332b9a4"
SRCREV = "${@opendreambox_srcrev('3829016a97b338f0cf7f0d41e07f9d66b876eeec', d)}"
PV = "4.4.1"

inherit autotools opendreambox-github

RDEPENDS_${PN} = "enigma2-plugin-extensions-weatherplugin"

require enigma2-plugin.inc

GITHUB_PROJECT = "enigma2-skincomponent-weathercomponent"
