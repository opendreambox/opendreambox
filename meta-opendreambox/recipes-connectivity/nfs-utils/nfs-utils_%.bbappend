SRC_URI += "file://0001-Install-libnfs.a-and-nfsrpc.h-build-libnfs-with-fPIC.patch \
            file://0002-Fix-uninitialised-variable-usage-in-nfs_options2pmap.patch"

FILESEXTRAPATHS_prepend := "${THISDIR}/${BPN}:"
