PR .= "-dream2"

PACKAGES =+ "${PN}-rt2800usb ${PN}-rt73usb"

LICENSE_${PN}-rt2800usb = "Firmware:LICENCE.ralink-firmware.txt"
FILES_${PN}-rt2800usb = " \
  /lib/firmware/rt2870.bin \
"

LICENSE_${PN}-rt73usb = "Firmware:LICENCE.ralink-firmware.txt"
FILES_${PN}-rt73usb = " \
  /lib/firmware/rt73.bin \
"
