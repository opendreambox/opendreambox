PR .= "-dream1"

QT_CONFIG_FLAGS := "${@oe_filter_out('^(-webkit)$', '${QT_CONFIG_FLAGS}', d)} -no-webkit"
