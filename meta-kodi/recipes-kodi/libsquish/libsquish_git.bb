DESCRIPTION = "libCEC allows you in combination with the right hardware to control your device with your TV remote control. Utilising your existing HDMI cabling"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://README;md5=2a51a796ca47e91336a4d198147ba58f"

PR = "r0"
inherit autotools-brokensep pkgconfig

SRC_URI = "git://github.com/OpenELEC/libsquish.git \
            file://0001-remove-installdir-from-config.patch \
            "

SRCREV = "52e7d93c5947f72380521116c05d97c528863ba8"

S = "${WORKDIR}/git"

do_install() {
  install -d ${D}/lib
  install -d ${D}/lib/pkgconfig
  install -d ${D}/include
  install -m 400 ${S}/squish.h ${D}/include/squish.h
  install -m 400 ${S}/squish.pc ${D}/lib/pkgconfig/squish.pc
}

FILES_${PN} += "/include/squish.h"
FILES_${PN} += "/lib/pkgconfig/squish.pc"

