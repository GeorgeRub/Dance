package com.kindergarten.dance.utils.image;

import net.coobird.thumbnailator.Thumbnails;
import net.coobird.thumbnailator.resizers.Resizers;

import java.awt.image.BufferedImage;
import java.io.IOException;

public class ScaleImageUtil {

    public BufferedImage scaleImage(BufferedImage originalImage, int targetWidth, int targetHeight) {
        try {
            originalImage = Thumbnails.of(originalImage).forceSize(targetWidth, targetHeight).resizer(Resizers.PROGRESSIVE).asBufferedImage();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return originalImage;
    }

}
