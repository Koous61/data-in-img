package io;

import java.io.IOException;
import java.io.InputStream;

public class ImageIOImpl<I> implements ImageIO<I> {
    @Override
    public I load(String path) {
        try {
            InputStream in = getClass().getResourceAsStream(path);

            return (I) javax.imageio.ImageIO.read(in);
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
