PR = "${INC_PR}.0"

RDEPENDS_${PN} = " \
  dropbear-xinetd \
  vsftpd-xinetd \
"

require task-opendreambox-base.inc
