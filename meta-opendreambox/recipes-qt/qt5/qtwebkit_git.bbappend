SRC_URI += " \
        file://0001-Expose-WebSecurityEnabled-via-Qt.patch \
        file://0002-Add-HbbTV-Mimetypes.patch \
        file://0003-always-emit-keypress-event-with-keycode.patch \
        file://0004-Enable-NPAPI-for-Qt-without-X11.patch \
        file://0005-import-a-bunch-of-hbbtv-patches.patch \
        file://0006-ANGLE-remove-EGL-GLES2-KHR-headers.patch \
        file://0007-Fix-Index-Accessor-For-RuntimeObject.patch \
"

FILESEXTRAPATHS_prepend := "${THISDIR}/qtwebkit-git:"
