DESCRIPTION = "libCEC allows you in combination with the right hardware to control your device with your TV remote control. Utilising your existing HDMI cabling"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://README;md5=2a51a796ca47e91336a4d198147ba58f"

PR = "r0"
inherit autotools pkgconfig

SRC_URI = "git://github.com/OpenELEC/libsquish.git \
            file://0001-remove-installdir-from-config.patch \
            "

SRCREV = "52e7d93c5947f72380521116c05d97c528863ba8"


S = "${WORKDIR}/git"

do_install() {
   cd ${S}
   mkdir ${D}/lib
   mkdir ${D}/lib/pkgconfig
   mkdir ${D}/include
   export INSTALL_DIR=${D}
   make install
}



