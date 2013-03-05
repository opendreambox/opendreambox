PR = "${INC_PR}.0"

RDEPENDS_${PN} = " \
  dropbear-xinetd \
  vsftpd-xinetd \
"

require packagegroup-opendreambox-base.inc
