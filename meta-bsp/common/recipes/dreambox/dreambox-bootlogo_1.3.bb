# This .bb solely exists in order to make BitBake find
# dreambox-bootlogo.sysvinit. Apparently, .inc files
# cannot add extra file search paths.
PR = "${INC_PR}.0"

require dreambox-bootlogo.inc
