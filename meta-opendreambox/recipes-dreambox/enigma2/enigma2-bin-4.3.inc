LIC_FILES_CHKSUM = "file://usr/share/doc/enigma2/LICENSE;md5=b7af6701c3fc2185e1ee44e9b94dff63"

DEPENDS += " \
    freetype \
    fribidi \
    giflib \
    glib-2.0 \
    gstreamer1.0 \
    gstreamer1.0-plugins-base \
    libaio \
    libav \
    libbluray \
    libconnman-qte \
    libdlsym \
    libdreamdvd \
    libdvbsi++ \
    libdvdnav \
    libdvdread \
    libjpeg-turbo \
    libpng \
    libsigc++-2.0 \
    libxml2 \
    openssl \
    python \
    qt4-embedded \
    qxmpp-e \
    sqlite3 \
    systemd \
    zlib \
"

inherit opendreambox-precompiled-binary

RDEPENDS_${PN} += " \
    libegl \
    libgles2 \
    qnullscreen \
    qt4-embedded-plugin-sqldriver-sqlite \
"

require enigma2-common.inc
