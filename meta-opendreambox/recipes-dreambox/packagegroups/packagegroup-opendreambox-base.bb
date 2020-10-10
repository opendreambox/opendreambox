SUMMARY = "OpenDreambox: Base Task for the OpenDreambox Distribution"
SECTION = "opendreambox/base"
LICENSE = "MIT"

inherit packagegroup

RDEPENDS_${PN} += " \
  dreambox-vm-settings \
  killall \
  parted \
  procps \
  tpmd \
  tuxbox-common \
  tzdata \
  tzdata-europe \
  xfsprogs-mkfs \
"

RRECOMMENDS_${PN} += " \
  autofs \
  avahi-daemon \
  bash \
  bash-completion \
  bash-completion-extra \
  dccamd \
  dreambox-compat \
  dropbear \
  e2fsprogs-e2fsck \
  haveged \
  hdstandby \
  joe \
  less \
  mc \
  samba-base \
  vsftpd \
  zeroconf \
"
