#!/usr/bin/env python3
#
# Copyright (c) 2017 Dream Property GmbH, Germany
#                    https://dreambox.de/
#
# Permission is hereby granted, free of charge, to any person obtaining a copy
# of this software and associated documentation files (the "Software"), to deal
# in the Software without restriction, including without limitation the rights
# to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
# copies of the Software, and to permit persons to whom the Software is
# furnished to do so, subject to the following conditions:
#
# The above copyright notice and this permission notice shall be included in
# all copies or substantial portions of the Software.
#
# THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
# IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
# FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
# AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
# LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
# OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
# THE SOFTWARE.
#

from sys import stdin

env = {}

for line in stdin.read().splitlines():
	local, expr = line.split(' ', 1)
	assert(local == "local")
	key, value = expr.split('=', 1)
	assert(value.startswith('"'))
	assert(value.endswith('"'))
	value = value[1:-1]
	if not key in env:
		env[key] = value

env['MESON_C_ARGS'] = env.get('HOST_CC_ARCH', '').split() + env.get('TOOLCHAIN_OPTIONS', '').split()
env['MESON_LINK_ARGS'] = env.get('MESON_C_ARGS') + env.get('LDFLAGS', '').split()
env['MESON_HOST_ENDIAN'] = ['little', 'big']['be' in env.get('SITEINFO_ENDIANNESS', '')]

print('''[binaries]
c = '{STAGING_BINDIR_TOOLCHAIN}/{HOST_PREFIX}gcc'
cpp = '{STAGING_BINDIR_TOOLCHAIN}/{HOST_PREFIX}g++'
ar = '{STAGING_BINDIR_TOOLCHAIN}/{HOST_PREFIX}ar'
ld = '{STAGING_BINDIR_TOOLCHAIN}/{HOST_PREFIX}ld'
strip = '{STAGING_BINDIR_TOOLCHAIN}/{HOST_PREFIX}strip'
readelf = '{STAGING_BINDIR_TOOLCHAIN}/{HOST_PREFIX}readelf'
pkgconfig = '{STAGING_BINDIR_NATIVE}/pkg-config'

[properties]
needs_exe_wrapper = true
c_args = {MESON_C_ARGS}
c_link_args = {MESON_LINK_ARGS}
cpp_args = {MESON_C_ARGS}
cpp_link_args = {MESON_LINK_ARGS}

[host_machine]
system = '{HOST_OS}'
cpu_family = '{HOST_ARCH}'
cpu = '{HOST_ARCH}'
endian = '{MESON_HOST_ENDIAN}'

[target_machine]
system = '{HOST_OS}'
cpu_family = '{HOST_ARCH}'
cpu = '{HOST_ARCH}'
endian = '{MESON_HOST_ENDIAN}'
'''.format(**env))
