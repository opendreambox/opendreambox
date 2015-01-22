SUMMARY = "OpenDreambox: Required system locales for the OpenDreambox Distribution"
SECTION = "opendreambox/base"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${OPENDREAMBOX_BASE}/LICENSE;md5=ed920ea8b6701825484d079e87a3a73a"

inherit packagegroup

PACKAGE_ARCH = "${MACHINE_ARCH}"

RRECOMMENDS_${PN} += " \
  locale-base-en-gb \
  locale-base-de-de \
  locale-base-ar-ae \
  locale-base-pt-br \
  locale-base-ca-ad \
  locale-base-hr-hr \
  locale-base-cs-cz \
  locale-base-da-dk \
  locale-base-nl-nl \
  locale-base-et-ee \
  locale-base-fi-fi \
  locale-base-fr-fr \
  locale-base-el-gr \
  locale-base-he-il \
  locale-base-hu-hu \
  locale-base-lt-lt \
  locale-base-lv-lv \
  locale-base-is-is \
  locale-base-it-it \
  locale-base-no-no \
  locale-base-fa-ir \
  locale-base-pl-pl \
  locale-base-pt-pt \
  locale-base-ru-ru \
  locale-base-sr-yu \
  locale-base-sk-sk \
  locale-base-sl-si \
  locale-base-es-es \
  locale-base-sv-se \
  locale-base-tr-tr \
  locale-base-uk-ua \
  locale-base-fy-nl \
"
