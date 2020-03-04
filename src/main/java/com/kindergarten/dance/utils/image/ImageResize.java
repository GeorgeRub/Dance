package com.kindergarten.dance.utils.image;

import java.awt.image.BufferedImage;

public class ImageResize {

    public static BufferedImage resizeImage(BufferedImage originalImage, int targetWidth) {
        if (originalImage != null) {
//            System.out.println("before -> " + originalImage.getWidth() + " -> " + originalImage.getHeight());
            double definerCoefficient = (double) originalImage.getWidth() / targetWidth;
//            System.out.println(definerCoefficient);
            int height = (int) (originalImage.getHeight() / definerCoefficient);
            originalImage = new ScaleImageUtil().scaleImage(originalImage, targetWidth, height);
//            System.out.println("after -> " + originalImage.getWidth() + " -> " + originalImage.getHeight());
            return originalImage;
        }
        return null;
    }

}
