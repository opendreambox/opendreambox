DEPENDS = ""

SRC_URI += "file://lighttpd.conf.in"

EXTRA_OECONF = ""

PACKAGECONFIG ?= "pcre zlib \
    ${@base_contains('DISTRO_FEATURES', 'ipv6', 'ipv6', '', d)} \
    ${@base_contains('DISTRO_FEATURES', 'largefile', 'lfs', '', d)} \
    ${@base_contains('DISTRO_FEATURES', 'xattr', 'attr', '', d)} \
"
PACKAGECONFIG[lfs] = "--enable-lfs,--disable-lfs"
PACKAGECONFIG[ipv6] = "--enable-ipv6,--disable-ipv6"
PACKAGECONFIG[mmap] = "--enable-mmap,--disable-mmap"
PACKAGECONFIG[libev] = "--with-libev,--without-libev,libev"
PACKAGECONFIG[mysql] = "--with-mysql,--without-mysql,mariadb"
PACKAGECONFIG[ldap] = "--with-ldap,--without-ldap,openldap"
PACKAGECONFIG[attr] = "--with-attr,--without-attr,attr"
PACKAGECONFIG[valgrind] = "--with-valgrind,--without-valgrind,valgrind"
PACKAGECONFIG[openssl] = "--with-openssl,--without-openssl,openssl"
PACKAGECONFIG[kerberos5] = "--with-kerberos5,--without-kerberos5"
PACKAGECONFIG[pcre] = "--with-pcre,--without-pcre,libpcre"
PACKAGECONFIG[zlib] = "--with-zlib,--without-zlib,zlib"
PACKAGECONFIG[bzip2] = "--with-bzip2,--without-bzip2,bzip2"
PACKAGECONFIG[fam] = "--with-fam,--without-fam,gamin"
PACKAGECONFIG[webdav-props] = "--with-webdav-props,--without-webdav-props,libxml2 sqlite3"
PACKAGECONFIG[webdav-locks] = "--with-webdav-locks,--without-webdav-locks,util-linux"
PACKAGECONFIG[gdbm] = "--with-gdbm,--without-gdbm,gdbm"
PACKAGECONFIG[memcache] = "--with-memcache,--without-memcache,memcached"
PACKAGECONFIG[lua] = "--with-lua,--without-lua,lua5.1"

do_install_append() {
        rm -rf ${D}/www
        sed -e 's,@localstatedir@,${localstatedir},g' -e 's,@sysconfdir@,${sysconfdir},g' \
                < ${WORKDIR}/lighttpd.conf.in > ${D}${sysconfdir}/lighttpd.conf
}

RDEPENDS_${PN} = "lighttpd-module-dirlisting \
                  lighttpd-module-indexfile \
                  lighttpd-module-staticfile"

RRECOMMENDS_${PN} = "lighttpd-module-access \
                     lighttpd-module-accesslog"

FILESEXTRAPATHS_prepend := "${THISDIR}/${P}:"
