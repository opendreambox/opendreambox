#!/bin/sh
#
# Copyright (c) 2010-2012 Dream Multimedia GmbH, Germany
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

DEST=$1

if [ -z "$DEST" ]; then
	echo "Usage: $0 <bbfile>"
	exit 1
fi

TEMP=`tempfile` || {
	echo "Fatal: Could not create temporary file."
	exit 1
}

GIT_ROOT=`git rev-parse --show-cdup 2>/dev/null` || {
	echo "Fatal: You must run this script from a Git checkout."
	exit 1
}

if [ -z "$GIT_ROOT" ]; then
	GIT_ROOT="."
fi

if [ -f $GIT_ROOT/meta-openembedded/contrib/oe-stylize.py ]; then
	OE_STYLIZE="$GIT_ROOT/meta-openembedded/contrib/oe-stylize.py"
elif [ -f $GIT_ROOT/../meta-openembedded/contrib/oe-stylize.py ]; then
	OE_STYLIZE="$GIT_ROOT/../meta-openembedded/contrib/oe-stylize.py"
else
	echo "Fatal: oe-stylize.py not found."
	exit 1
fi

$OE_STYLIZE $DEST >> $TEMP

diff -u $DEST $TEMP
if [ $? -eq 0 ]; then
	rm $TEMP
	exit 0
fi

echo -n "Apply this patch? [Y/n] "
read ANSWER

if [ ! -z "$ANSWER" -a "$ANSWER" != "Y" -a "$ANSWER" != "y" ]; then
	rm $TEMP
	echo "Aborted."
	exit 1
fi

chmod --reference=$DEST $TEMP
mv $TEMP $DEST
echo "Done."
exit 0
