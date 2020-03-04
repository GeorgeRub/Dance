package com.kindergarten.dance.utils.image;

import net.coobird.thumbnailator.Thumbnails;

import java.awt.image.BufferedImage;

public class CutImageUtil {

    public BufferedImage cutImage(BufferedImage originalImage, int targetWidth, int targetHeight) {
        if (originalImage != null) {
            try {
                int width = 0;
                int height = 0;
                while (originalImage.getWidth() > (width + targetWidth) && originalImage.getHeight() > (height + targetHeight)) {
                    width += targetWidth;
                    height += targetHeight;
                }

                //expand an image to the max size

                if ((width + targetWidth) > originalImage.getWidth()) {
                    double tempWidth = originalImage.getWidth() - width;
                    double coefficient = targetWidth / tempWidth;
                    width = originalImage.getWidth();
                    height = (int) (height + (targetHeight / coefficient));
                } else {
                    double tempHeight = originalImage.getHeight() - height;
                    double coefficient = targetHeight / tempHeight;
                    height = originalImage.getHeight();
                    width = (int) (width + (targetWidth / coefficient));
                }
                int startY = (originalImage.getHeight() - height) / 2;
                int startX = (originalImage.getWidth() - width) / 2;
                originalImage = Thumbnails.of(originalImage).sourceRegion(startX, startY, width, height).size(width, height).keepAspectRatio(true).asBufferedImage();
                return originalImage;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
        return null;
    }

}
