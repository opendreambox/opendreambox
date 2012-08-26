#!/bin/sh

# dont delete this script !
# this script mounts/umounts squashfs compressed packages which was busy during package install / remove

for i in `find /var/tmp/ -maxdepth 1 -regex "^/var/tmp/\.umount_.\+_needed$"`; do
        img=`echo $i | sed 's:^/var/tmp/\.umount_\(.\+\)_needed$:\1:'`
        umount /media/squashfs-images/$img && losetup -d `losetup | grep $img | cut -d: -f1` > /dev/null 2>&1 && echo "successfully umounted /media/squashfs-images/$img" || /bin/true
        rm $i || /bin/true
done;

for i in `find /var/tmp/ -maxdepth 1 -regex "^/var/tmp/\.mount_.\+_needed$"`; do
        img=`echo $i | sed 's:^/var/tmp/\.mount_\(.\+\)_needed$:\1:'`
        mount -t squashfs -o ro,loop /squashfs-images/$img /media/squashfs-images/$img > /dev/null 2>&1 && echo "successfully mounted /media/squashfs-images/$img" || /bin/true
        rm $i || /bin/true
done;
