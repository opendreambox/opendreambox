# dreambox.inc

GLIBC_EXTRA_OECONF = "--with-tls --with-__thread"

MACHINE_ESSENTIAL_EXTRA_RDEPENDS += "packagegroup-opendreambox-essential"
MACHINE_FEATURES += "alsa kernel26 wifi"

PREFERRED_PROVIDER_virtual/kernel = "linux-dreambox"
