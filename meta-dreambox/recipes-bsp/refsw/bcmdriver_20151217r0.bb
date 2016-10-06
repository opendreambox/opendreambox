require bcmdriver.inc

SRC_URI[dm900.md5sum] = "a871623c243774ce8166a816d8f21aa1"
SRC_URI[dm900.sha256sum] = "e7504565a50fb166972926426910c36c89857ccc492d78c0fea081efb73b9792"

inherit opendreambox-precompiled-binary

COMPATIBLE_MACHINE = "^(dm900)$"
