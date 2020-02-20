LIC_FILES_CHKSUM = "file://usr/share/doc/enigma2/LICENSE;md5=b7af6701c3fc2185e1ee44e9b94dff63"

DEPENDS += " \
    boost \
    freetype \
    fribidi \
    giflib \
    glib-2.0 \
    gstreamer1.0 \
    gstreamer1.0-plugins-base \
    libaio \
    libav \
    libbluray \
    libconnman-qt5 \
    libdlsym \
    libdreamdvd \
    libdvbsi++ \
    libdvdnav \
    libdvdread \
    libjpeg-turbo \
    libpng \
    libsigc++-2.0 \
    libunwind \
    libwebm \
    libxml2 \
    openssl \
    pugixml \
    python \
    qtbase \
    qtwebkit \
    qtsvg \
    sqlite3 \
    systemd \
    zlib \
"

inherit opendreambox-precompiled-binary

RDEPENDS_${PN} += " \
    libegl \
    libgles2 \
    qtbase-plugin-platforms-qoffscreen \
    qtbase-plugin-sqldrivers-qsqlite \
"

require enigma2-common.inc
