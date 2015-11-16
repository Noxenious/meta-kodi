include recipes-core/images/core-image-minimal.bb

IMAGE_FEATURES += "debug-tweaks splash x11-base"

# Add extra image features
EXTRA_IMAGE_FEATURES += " \
    nfs-server \
    tools-debug \
    tools-profile \
    ssh-server-openssh \
"

IMAGE_INSTALL += " \
    alsa-tools \
    alsa-state \
    curl \
    ethtool \
    gettext \
    glibc-gconv-ibm850 \
    glibc-gconv-cp1252 \
    glibc-gconv-utf-32 \
    kodi \
    mesa \
    mesa-demos \
    mpeg2dec \
    piglit \
    openssh-sftp-server \
    packagegroup-core-sdk \
    procps \
    pulseaudio \
    rsync \ 
    samba \
    transmission \
    util-linux-mount \
    util-linux \
"

ENABLE_BINARY_LOCALE_GENERATION = "1"

export IMAGE_BASENAME = "kodi-image"
