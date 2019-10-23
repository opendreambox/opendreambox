MULTI_ARCH_openssl-conf = "foreign"
PR := "r1"

RRECOMMENDS_libcrypto_remove = "openssl-conf"
RRECOMMENDS_${PN}_class-target += "openssl-conf"
