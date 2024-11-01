SUMMARY = "mm5d91 Linux kernel module"
DESCRIPTION = "${SUMMARY}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit module

SRC_URI = "file://Makefile \
           file://mm5d91_driver.c \
           file://mm5d91_driver.h \
           file://mm5d91_ioctl.h \
          "
#S = "${@'WORKDIR/source' if d.getVar('DISTRO_CODENAME') == 'styhead' else 'WORKDIR'}"
S = "${WORKDIR}"

# The inherit of module.bbclass will automatically name module packages with
# "kernel-module-" prefix as required by the oe-core build environment.

RPROVIDES:${PN} += "kernel-module-mm5d91-driver"
