SUMMARY = "Utilities needed to do transponder blindscan with dreambox dvb receivers"
DEPENDS = "ncurses"
INC_PR = "r2"

RCONFLICTS_${PN} = "blindscan-bsbe1-c01a blindscan-cxd1978 blindscan-cxd2820 blindscan-tda1002x blindscan-tda10046"
RREPLACES_${PN} = "blindscan-bsbe1-c01a blindscan-cxd1978 blindscan-cxd2820 blindscan-tda1002x blindscan-tda10046"
