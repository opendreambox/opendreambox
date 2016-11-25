PACKAGES =+ "${PN}-rt2800usb ${PN}-rt73usb"

LICENSE_${PN}-rt2800usb = "Firmware-ralink-firmware"
FILES_${PN}-rt2800usb = " \
  /lib/firmware/rt2870.bin \
"

LICENSE_${PN}-rt73usb = "Firmware-ralink-firmware"
FILES_${PN}-rt73usb = " \
  /lib/firmware/rt73.bin \
"
