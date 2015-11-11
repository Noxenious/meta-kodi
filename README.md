meta-kodi
==============

Universal Kodi Media Layer
based upon the works of:
https://github.com/alfonsotames/meta-kodi
https://github.com/ronan22/meta-kodi

**_Test Layer with Yocto_**

## Create working directory

    mkdir ~/yocto
    cd ~/yocto

## Get poky (Latest release jethro)

    git clone -b jethro git://git.yoctoproject.org/poky.git
 
## Get meta-oe

    git clone -b jethro git://git.openembedded.org/meta-openembedded

## Get meta-kodi:

    git clone https://github.com/Noxenious/meta-kodi.git

## init your project:
    cd poky
    oe-init-build-env

## add your meta:
    vi conf/bblayers.conf 

* Add meta-kodi path to BBLAYERS variable (e.g. /home/user/yocto/meta-kodi/meta-kodi)
* Add meta-oe path to BBLAYERS variable (e.g. /home/user/yocto/meta-openembedded/meta-oe)
 
## add LICENSE_FLAGS_WHITELIST

    vi conf/local.conf

* Add LICENSE_FLAGS_WHITELIST += "commercial"

## Build your image:

    bitbake kodi-image 

## Test your image:
On a terminal
    runqemu qemux86 kodi-image

On a web navigator such as firefox, go to

    http://192.168.7.2

192.168.7.2 should be the address given to qemu machine by default
You should see a HTML Menu with file manager & Transmission (Torrent Client)


**_Machine specific layers_**

For different CPUs additional layers are required (e.g. meta-intel, meta-fsl-arm, meta-sunxi)

Work in progress. Comments / help welcome.