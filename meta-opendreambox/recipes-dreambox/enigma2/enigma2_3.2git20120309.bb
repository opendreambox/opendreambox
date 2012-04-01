PR = "${INC_PR}.0"

SRC_URI = "file://0001-Screens-RecordPaths.py-allow-selection-of-enigma2-co.patch \
           file://0002-Components-Harddisk.py-reconfigure-old-linked-defaul.patch"
SRC_URI[dm500hd.md5sum] = "3671f8a8f2745eeb1a6200fdcba2ed68"
SRC_URI[dm500hd.sha256sum] = "f448953b4db09ea7954669f433f5fbabe6b1e7a25db1a8456bb2790ff1ac49fa"
SRC_URI[dm7020hd.md5sum] = "23d06757c73ed33360b0969c819a95d1"
SRC_URI[dm7020hd.sha256sum] = "54322ce0680a630298d2938ab545a805192f017231a382de33c7f8f9cb7f67bc"
SRC_URI[dm800.md5sum] = "f3a4166a02f7b9be6b2b324c67ef5f2a"
SRC_URI[dm800.sha256sum] = "9303196dd68954b874d773db42311a576b15d7236c3e3a007e9fe8c838e161ef"
SRC_URI[dm8000.md5sum] = "471f40c034041370d65aaa683c6b3466"
SRC_URI[dm8000.sha256sum] = "2c2eda250e609ba12b5d66ba42b66c0a3855114c4899c3ea0b01e8fdbb017df8"
SRC_URI[dm800se.md5sum] = "ec368bd5afd3f6b8cefe7c13471d2a80"
SRC_URI[dm800se.sha256sum] = "efc470ce0980021041cc8c26b2daea88d1ca3c398d32ed16f113e5f41a496530"

require enigma2-bin-3.2.inc
