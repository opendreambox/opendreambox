SUMMARY = "OpenDreambox: Base Task for the OpenDreambox Distribution"
SECTION = "opendreambox/base"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${OPENDREAMBOX_BASE}/LICENSE;md5=ed920ea8b6701825484d079e87a3a73a"

inherit packagegroup

RDEPENDS_${PN} += " \
  dropbear \
  killall \
  parted \
  procps \
  tpmd \
  tuxbox-common \
  tzdata \
  vsftpd \
  xfsprogs-mkfs \
"

RRECOMMENDS_${PN} += " \
  autofs \
  avahi-daemon \
  dccamd \
  e2fsprogs-e2fsck \
  joe \
  libpagecache \
  mc \
  samba-base \
  zeroconf \
"
