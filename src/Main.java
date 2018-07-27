import binary.Binarization;
import binary.BinarizationImpl;
import io.ImageIO;
import io.ImageIOImpl;

import java.awt.image.BufferedImage;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ImageIO<BufferedImage> imageIO = new ImageIOImpl();
        BufferedImage image = imageIO.load("img/in/1.jpg");

        Binarization<BufferedImage> binarization = new BinarizationImpl<>();
        byte[] bytes = binarization.asBinary(image);


        imageIO.save(image, "img/out/1.jpg");
    }
}
