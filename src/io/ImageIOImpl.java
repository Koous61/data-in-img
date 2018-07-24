package io;

import java.io.File;
import java.io.IOException;

public class ImageIOImpl<I> implements ImageIO<I> {
    @Override
    public I load(String path) {
        try {
            return (I) javax.imageio.ImageIO.read(new File(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Boolean save(String path) {
        return null;
    }
}
