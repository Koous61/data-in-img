package binary;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class BinarizationImpl<D> implements Binarization<D> {
    @Override
    public byte[] asBinary(D data) throws IOException {
        if (data instanceof BufferedImage) {
            BufferedImage originalImage = (BufferedImage) data;

            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ImageIO.write(originalImage, "jpg", byteArrayOutputStream);
            byteArrayOutputStream.flush();

            return byteArrayOutputStream.toByteArray();
        } else {
            throw new UnsupportedOperationException();
        }
    }
}
