include recipes-kodi/images/kodi-image.bb

LICENSE = "MIT"

# SOC_EXTRA_IMAGE_FEATURES ?= "tools-testapps"
SOC_EXTRA_IMAGE_FEATURES=""

# Add extra image features
EXTRA_IMAGE_FEATURES += "${SOC_EXTRA_IMAGE_FEATURES}"

IMAGE_INSTALL += " \
    packagegroup-fsl-tools-gpu \
    fsl-rc-local \
    fsl-alsa-plugins \
"

export IMAGE_BASENAME = "kodi-image-imx"

