SRC_URI += " \
    file://0001-fix-build-with-ffmpeg4.patch;patchdir=src/3rdparty \
    file://0002-always-allow-javscript-to-close-a-window.patch;patchdir=src/3rdparty \
"
PACKAGECONFIG = "libwebp libevent opus proprietary-codecs webrtc ffmpeg zlib"
export NINJAFLAGS="${PARALLEL_MAKE}"

FILESEXTRAPATHS_prepend := "${THISDIR}/qtwebengine:"
