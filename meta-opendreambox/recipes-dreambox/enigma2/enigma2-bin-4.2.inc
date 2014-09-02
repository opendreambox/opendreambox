LIC_FILES_CHKSUM = "file://usr/share/doc/enigma2/LICENSE;md5=e943a2b66bda2bf828e561a3e6c7ecfc"

DEPENDS += " \
    freetype \
    fribidi \
    giflib \
    glib-2.0 \
    gstreamer \
    gst-plugins-base \
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
