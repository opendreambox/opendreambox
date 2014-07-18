#!/bin/sh
#
# Copyright (c) 2010-2014 Dream Property GmbH, Germany
#                         http://www.dream-multimedia-tv.de/
# Authors:
#   Andreas Oberritter <obi@opendreambox.org>
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

cleanup()
{
	[ -z "$TEMP" ] || rm -f "$TEMP"
}

DEST=$1

if [ -z "$DEST" ]; then
	echo "Usage: $0 <bbfile>"
	exit 1
fi

TEMP=`mktemp` || {
	echo "Fatal: Could not create temporary file."
	exit 1
}

trap cleanup EXIT

DIR=$PWD
while [ "$DIR" != "/" ]; do
	if [ -e $DIR/meta-openembedded/contrib/oe-stylize.py ]; then
		OE_STYLIZE="$DIR/meta-openembedded/contrib/oe-stylize.py"
		break
	fi
	DIR=`dirname $DIR`
done

if [ -z "$OE_STYLIZE" ]; then
	echo "Fatal: oe-stylize.py not found."
	exit 1
fi

$OE_STYLIZE $DEST >> $TEMP

diff -u $DEST $TEMP
if [ $? -eq 0 ]; then
	exit 0
fi

printf "Apply this patch? [Y/n] "
read ANSWER

if [ ! -z "$ANSWER" -a "$ANSWER" != "Y" -a "$ANSWER" != "y" ]; then
	echo "Aborted."
	exit 1
fi

chmod --reference=$DEST $TEMP
mv $TEMP $DEST
echo "Done."
exit 0
