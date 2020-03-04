package com.kindergarten.dance.utils.image;

import java.awt.image.BufferedImage;

public class CropImageUtil {

    public BufferedImage cropImage(BufferedImage originalImage, int targetWidth, int targetHeight) {
        if (originalImage != null) {
            return new CutImageUtil().cutImage(originalImage, targetWidth, targetHeight);
        } else {
            return null;
        }
    }

}
