#include recipes-core/images/core-image-base.bb
#include recipes-graphics/images/core-image-weston.bb
include recipes-graphics/images/core-image-x11.bb
#include recipes-sato/images/core-image-sato.bb
#include recipes-core/images/build-appliance-image_8.0.bb

#Based on meta-stef by Wolfgar

LICENSE = "MIT"


IMAGE_FEATURES += "debug-tweaks"

# Add extra image features
EXTRA_IMAGE_FEATURES += " \
    nfs-server \
    tools-debug \
    tools-profile \
    ssh-server-openssh \
"

IMAGE_INSTALL += " \
    mesa \
    piglit \
    libegl-gallium \
    mesa-demos \
    mpeg2dec \
    openssh-sftp-server \
    kodi \
    procps \
    util-linux-mount \
    util-linux \
    packagegroup-core-sdk \
    joe \
    nano \
    rsync \
    ethtool \
    samba \
    curl \
    gettext \
    glibc-gconv-ibm850 \
    glibc-gconv-cp1252 \
    glibc-gconv-utf-32 \
    alsa-tools \
    alsa-state \
    alsa-utils-alsaconf \
    pulseaudio \
    transmission \
"

#IMAGE_INSTALL += " \
#    qemu \
#    libvirt \
#    libvirt-libvirtd \
#    libvirt-virsh \
#    kernel-module-kvm \
#    kernel-module-kvm-intel \
#    "

ENABLE_BINARY_LOCALE_GENERATION = "1"

export IMAGE_BASENAME = "kodi-image"

#     TODO:     tvheadend
