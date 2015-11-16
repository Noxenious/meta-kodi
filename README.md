meta-kodi
==============

Universal Kodi Media Layer

## Test Layer with Yocto

**_Needed packages (Ubuntu)_**

    sudo apt-get install gawk wget git-core diffstat unzip zip texinfo gcc-multilib build-essential chrpath socat libsdl1.2-dev xterm openjdk-7-jdk

**_Create working directory_**

    mkdir ~/yocto
    cd ~/yocto

**_Get poky, meta-oe and meta-kodi (Latest release jethro)_**

    git clone -b jethro git://git.yoctoproject.org/poky.git
    git clone -b jethro git://git.openembedded.org/meta-openembedded
    git clone https://github.com/jlucius/meta-kodi.git

**_Init your project:_**

    cd poky
    source oe-init-build-env

**_Edit configuration:_**

    vi conf/bblayers.conf 

* Add meta-kodi path to BBLAYERS variable (e.g. /home/user/yocto/meta-kodi/meta-kodi)
* Add meta-oe path to BBLAYERS variable (e.g. /home/user/yocto/meta-openembedded/meta-oe)

    vi conf/local.conf
 
* Add LICENSE_FLAGS_WHITELIST += "commercial"

**_Build your image:_**

    bitbake kodi-image 

**_Test your image:_**

On a terminal

    runqemu qemux86 kodi-image

On a web navigator such as firefox, go to

    http://192.168.7.2

192.168.7.2 should be the address given to qemu machine by default.
You should see a HTML Menu with file manager & Transmission (Torrent Client)


## Machine specific layers

For different CPUs additional layers are required (e.g. meta-intel, meta-fsl-arm, meta-sunxi)

Work in progress. Comments / help welcome.

## Credits

Based upon the works of:

https://github.com/alfonsotames/meta-kodi

https://github.com/ronan22/meta-kodi