This README file contains information on the contents of the meta-mm5d91-kernel layer.

Please see the corresponding sections below for details.

Table of Contents
=================

  I. Adding the meta-mm5d91-kernel layer to your build
 II. Misc


I. Adding the meta-mm5d91-kernel layer to your build
=================================================

Run 'bitbake-layers add-layer meta-mm5d91-kernel'

remove all links from <path to your yocto main source folder>/meta-mm5d91-module/recipes-mm5d91-module/mm5d91-module/files/

Link files:
* ln -s <path to mm5d91-rpi4-driver folder>/Makefile-yocto <path to your yocto main source folder>/meta-mm5d91-module/recipes-mm5d91-module/mm5d91-module/files/Makefile
* ln -s <path to mm5d91-rpi4-driver folder>/mm5d91_driver.c <path to your yocto main source folder>/meta-mm5d91-module/recipes-mm5d91-module/mm5d91-module/files/mm5d91_driver.c
* ln -s <path to mm5d91-rpi4-driver folder>/mm5d91_driver.h <path to your yocto main source folder>/meta-mm5d91-module/recipes-mm5d91-module/mm5d91-module/files/mm5d91_driver.h
* ln -s <path to mm5d91-rpi4-driver folder>/mm5d91_ioctl.h <path to your yocto main source folder>/meta-mm5d91-module/recipes-mm5d91-module/mm5d91-module/files/mm5d91_ioctl.h

II. Misc
========

branch scarthgap
