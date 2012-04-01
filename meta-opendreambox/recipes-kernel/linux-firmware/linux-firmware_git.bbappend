PR .= "-dream1"

PACKAGES =+ "${PN}-rt73usb"

LICENSE_${PN}-rt73usb = "Firmware:LICENCE.ralink-firmware.txt"
FILES_${PN}-rt73usb = " \
  /lib/firmware/rt73.bin \
"
