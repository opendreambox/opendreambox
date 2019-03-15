# opendreambox 2.6

This is the build system of the opendreambox distribution, an embedded Linux distribution for Set-Top-Boxes manufactured by [Dream Property GmbH](https://dreambox.de/).

It is based on the [OpenEmbedded](https://www.openembedded.org/) build framework, which uses
BitBake to transform build instructions into distributable firmare images and software packages.

The current version is based on the [Yocto Project](https://www.yoctoproject.org/) release 2.3 „Pyro“, an umbrella project for OpenEmbedded and related tools.

We highly recommend taking a look at the [Yocto Project Reference Manual](https://www.yoctoproject.org/docs/2.3/ref-manual/ref-manual.html).

## Contributions

Maintainers of this release are:

  - [Andreas Monzner](mailto:ghost@opendreambox.org)
  - [Andreas Oberritter](mailto:obi@opendreambox.org)
  - [Stephan Reichholf](mailto:reichi@opendreambox.org)


### Bug reports

Please use GitHub's issue tracker to create bug reports, or send a mail to
**<bugs@opendreambox.org>** or one of the maintainers listed above.

### Patches

We accept pull-requests on GitHub as well as patches submitted by mail to **<patches@opendreambox.org>** or one of the maintainers listed above.

When sending patches by mail, please use something like `git send-email -M -1 --to patches@opendreambox.org` to let git send it, or `git format-patch -M -1` and send the resulting file as attachment, after all changes have been committed to your local copy of the repository.


## Supported products

This release includes support for the following products:

| **Product name**   | **Environment variable** |
| :----------------- | :----------------------- |
| Dreambox One       | `MACHINE=dreamone`       |


## License

    Copyright (c) 2019 Dream Property GmbH, Germany
                       https://dreambox.de/
    
    Permission is hereby granted, free of charge, to any person obtaining a copy
    of this software and associated documentation files (the "Software"), to deal
    in the Software without restriction, including without limitation the rights
    to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
    copies of the Software, and to permit persons to whom the Software is
    furnished to do so, subject to the following conditions:
    
    The above copyright notice and this permission notice shall be included in
    all copies or substantial portions of the Software.
    
    THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
    IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
    FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
    AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
    LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
    OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
    THE SOFTWARE.


## Obtaining the source code

To initially download the source into the current directory, issue the
following command:

`git clone -b pyro https://github.com/opendreambox/opendreambox.git`


## Quick start

For the impatient:

`make -C opendreambox image`

If this command fails, prerequisites may be missing. See section [„Prerequisites“](#prerequisites) below.

## Directory structure

Currently, these layers are used:

  - `meta-dreambox`
  - `meta-games`
  - `meta-golang`
  - `meta-opendreambox`
  - `meta-openembedded/meta-filesystems`
  - `meta-openembedded/meta-multimedia`
  - `meta-openembedded/meta-networking`
  - `meta-openembedded/meta-oe`
  - `meta-openembedded/meta-python`
  - `meta-openembedded/meta-webserver`
  - `meta-qt5`
  - `openembedded-core/meta`

If a recipe for the same package exists in multiple layers, then the
higher priority layer takes precedence over the lower priority layer.

For example, if `libmad_0.15.1b.bb` existed in both `meta-openembedded`
and `openembedded-core`, the recipe in `meta-openembedded` would be
used, because `openembedded-core` has lower priority. Priority values
are determined by the variable `BBFILE_PRIORITY` in `conf/layer.conf` of
each layer.

**NOTE:** This would still be true even if the version of `libmad` in
`openembeded-core` was higher than the version in `meta-openembedded`,
unless `PREFERRED_VERSION_libmad` was set to the version in
`openembedded-core`. There is currently no way to prefer a version of a
lower priority layer, if the same version is present in a higher
priority layer.

### openembedded-core and meta-openembedded

These directories contain copies of Git repositories from
git.openembedded.org, including the OpenEmbedded-Core layer and the
(Meta-)OpenEmbedded layers. They get created automatically when building
the distribution for the first time.

Throughout this document, the combination of these directories will be
referred to as OpenEmbedded.

The latest changes to these Git repositories can be seen at:

- <https://git.openembedded.org/openembedded-core-contrib/log/?h=obi/pyro>
- <https://git.openembedded.org/meta-openembedded-contrib/log/?h=obi/pyro>

### meta-opendreambox

This directory contains:

  - Recipes for packages written specifically for the opendreambox
    distribution
  - Modifications to recipes from OpenEmbedded
  - Recipes for different software versions than those available from
    OpenEmbedded

### meta-dreambox

The directory `meta-dreambox` contains Board Support Packages (BSP) for
the supported Dreambox models. This includes:

  - Hardware drivers
  - Machine specific overrides
  - The Linux kernel
  - The boot loader
  - Splash images


# Prerequisites

The OpenEmbedded project provides a general list of prerequisites for
many Linux distributions and also for some other operating systems.

  - <https://www.openembedded.org/wiki/Getting_started#Required_software>

It is highly recommended to use Linux to build opendreambox. In theory,
any recent distribution will do, but not many distributions have been
verified to build opendreambox without errors. Tested distributions
include:

  - [Debian 9 „Stretch“ \[amd64\]](https://www.debian.org/releases/stretch/)

  - [Ubuntu 18.04 LTS „Bionic Beaver“ \[amd64\]](http://releases.ubuntu.com/18.04/)

# Major changes since previous public release (2.5)

  - Added support for Dreambox One.
  - Moved from Yocto „Krogoth“ to „Pyro“.
  - OpenEmbedded switched to recipe-specific sysroots, which mandates passing an additional parameter to cross-compile.env, to specify the sysroot to be used.
  - You may pass a machine name to bitbake.env, which allows tools like devtool to be used.

# Known issues

  - Machines other than Dreambox One are not supported yet.

# Building opendreambox

In the top level directory, there is a `Makefile`, which is used to set
up build directories and to fetch or update all used repositories. The
Makefile can be influenced by environment variables, either by specifing
them on the command-line or by storing them in a file called
`conf/make.conf`. It is not recommended to edit the `Makefile` directly
in order to avoid conflicts with future updates.

When the `Makefile` is run for the first time, the following steps will
be executed:

  - Creation of configuration files
      - `bitbake.env`
      - `conf/opendreambox.conf`
      - `build/${MACHINE}/conf/bblayers.conf`
      - `build/${MACHINE}/conf/local.conf`

  - Update or checkout of Git repositories
      - opendreambox
      - BitBake
      - OpenEmbedded

## Makefile targets

Run `make help` to get a list of targets of the top level Makefile,
together with a brief description.

## Configuration variables

### BB\_NUMBER\_THREADS

Controls how many BitBake tasks may run at a time. Defaults to the
number of cores available on the build system.

### MACHINE

Controls the target machine to build packages for. See section
[Products](#products) for a list of supported products.

### PARALLEL\_MAKE

Controls how many processes per recipe `make` may use. Defaults to the
number of cores available on the build system.

## Adding custom layers

It is possible to add custom layers to the build system. This can be
done globally and per machine. To add a layer globally, edit
`conf/bblayers-ext.conf`. To add a machine-specific layer, edit
`conf/bblayers-${MACHINE}-ext.conf`. Assuming that an additional layer
is available at `${HOME}/custom-layer`, the entry to add to the file
will look like this:

`BBLAYERS =+ "${HOME}/custom-layer"`

## Adding custom options

It is possible to tweak a lot more options than those used by the
`Makefile` by editing `conf/local-ext.conf` or
`conf/local-${MACHINE}-ext.conf`.

For example, if the firmware shall use the package feed built on the
develoment machine, which happens to be 192.168.1.1 and has a webserver
configured to point to `tmp-glibc/deploy/deb`, a line like the following may
be added:

`DISTRO_FEED_URI = "http://192.168.1.1/${DISTRO}/${DISTRO_VERSION}"`

In general, any variable in OpenEmbedded that uses weak assignment
(`?=`) may be overridden from these files.

The following sections list some commonly used options.

### DISTRO\_FEED\_PREFIX

`DISTRO_FEED_PREFIX` specifies the name of the package update feed. This
name may be chosen arbitarily.

Default: `DISTRO_FEED_PREFIX = "remote"`

### DISTRO\_FEED\_URI

`DISTRO_FEED_URI` specifies the URI of the package update feed.

Default: `DISTRO_FEED_URI =
"http://my-distribution.example/remote-feed/"`

### INHERIT

`INHERIT` specifies bbclasses to include from a configuration file.
Usually, this variable gets appended to by using the `+=` operator.

The opendreambox distribution automatically appends `"buildhistory
recipe_sanity"` to `INHERIT`.

Default: `INHERIT = ""`

**Some examples:**

Always build the latest versions of opendreambox-related projects from
Git:

`INHERIT += "opendreambox-autorev"`

## Setting up a build directory

To set up a build directory for e.g. **DM920** run `make
MACHINE=dm920`. If `MACHINE=dm920` has been set in `conf/make.conf`
(default: dreamone), you can simply run `make` with no arguments instead.
This will create and initialize the directory `build/dm920`.

## Building a firmware image

To build a firmware image for e.g. **DM920** run `make MACHINE=dm920
image`. If `MACHINE=dm920` has been set in `conf/make.conf` (default:
dreamone), you can simply run `make image` instead.

## Building a package

To build a single package, BitBake has to be used directly. First, the
environment has to be set up, in order to make BitBake available to the
shell. This can be done with the following command:

`source bitbake.env dm920`

You can omit the last parameter, in which case you need to change to the build directory of your target machine before starting a build (`cd build/dm920`).

In order to build enigma2, run:

`bitbake enigma2`.


# Development hints

## Cross-compilation of external software

Opendreambox provides a script called `cross-compile.env`. Once run, the
script will create the following commands (shell aliases), aiming to
ease cross-compilation of external source trees:

  - `oe_autoreconf` - Calls OE’s version of `autoreconf`. Useful for
    projects based on GNU autotools.
  - `oe_runconf` - Calls `./configure` with parameters suitable for OE.
    Useful for projects based on GNU autotools.
  - `oe_runmake` - Calls `make` with parameters suitable for OE. Useful
    for projects based on GNU autotools or GNU make.
  - `oe_env` - Useful to execute arbitrary commands in the OE
    environment (e.g. `oe_env env`).
  - `oe_setenv` - Exports the OE environment to the currently running
    shell session.

The script needs to know the target machine, which can be one of the
supported products (see [Products](#products)). Because the script adds
aliases to your currently running shell session, it has to be invoked
using `source` or `.` (the dot operator).

Starting with opendreambox 2.6, another parameter became mandatory, because of OpenEmbedded's switch to recipe-specific sysroots, e.g.:

`source cross-compile.env dreamone busybox`

This tells cross-compile.env to set up aliases using the sysroot of busybox. Note that you need to build busybox first, before being able to use this command.

The script may be called from any location, but must reside inside the
opendreambox Git tree. You may want to create a symlink to
`cross-compile.env` somewhere in your `PATH`.

## Coding style

Run `scripts/do_stylize.sh` on new recipes to ensure proper coding
style.

## Package architecture

Set `PACKAGE_ARCH = "${MACHINE_ARCH}"` if either condition is met:

  - The recipe uses `COMBINED_FEATURES`, `MACHINE_FEATURES` or
    `DREAMBOX_FEATURES`.
  - The recipe uses `COMPATIBLE_MACHINE`.
  - The recipe is part of `meta-dreambox`.
