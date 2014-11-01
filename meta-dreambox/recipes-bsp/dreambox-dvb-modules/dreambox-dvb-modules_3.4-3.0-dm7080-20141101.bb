require dreambox-dvb-modules.inc

SRC_URI[modules.md5sum] = "70806cf0a480eb801dd63d4eb2b3af15"
SRC_URI[modules.sha256sum] = "e93699acf4a8e41d25499f9192cb0687cd5f5257f16449ea7b08985d640e8850"

COMPATIBLE_MACHINE = "^(dm7080)$"

RREPLACES_${PN}-stb-core = "${PN} (< 3.4-3.0-dm7080-20140906-r1)"
RBREAKS_${PN}-stb-core = "${PN} (< 3.4-3.0-dm7080-20140906-r1)"
