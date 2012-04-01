#!/bin/sh
mountpoint -q /var/volatile || mount /var/volatile
mkdir -m 0755 -p /var/volatile/run
