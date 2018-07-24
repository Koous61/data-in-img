package io;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageIOImpl<I> implements ImageIO<I> {
    @Override
    public  I load(String path) throws IOException {
            return (I) javax.imageio.ImageIO.read(new File(path));
    }

    @Override
    public Boolean save(I data, String path) throws IOException {
        File outputFile = new File(path);
        outputFile.getParentFile().mkdirs();
        javax.imageio.ImageIO.write((BufferedImage) data, "jpg", outputFile);
        return null;
    }
}
