package encrypt;

import binary.Binarization;
import util.ImageBlueprint;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


//шифрование
public class Encryptor {

    private static final int OFFSET = 100;
    private static final int TERMINATION_CHAR = 255;

    public static ImageBlueprint encrypt(ImageBlueprint imageBlueprint, String data) {
        int counter = 0;
        int[] buffer = Binarization.toBytes(data);
        for (int i = 0; i < imageBlueprint.getHeight() * imageBlueprint.getWidth(); i += OFFSET) {
            if (counter < buffer.length) {
                imageBlueprint.setPixel(i % imageBlueprint.getWidth(), i / imageBlueprint.getWidth(), buffer[counter]);
                counter++;
            } else {
                imageBlueprint.setPixel(i % imageBlueprint.getWidth(), i / imageBlueprint.getWidth(), TERMINATION_CHAR);
                break;
            }
        }
        return imageBlueprint;
    }

    public static String decrypt(ImageBlueprint encryptedImage) {
        List<Integer> buffer = new ArrayList<>();
        for (int i = 0; i < encryptedImage.getHeight() * encryptedImage.getWidth(); i += OFFSET) {
            if (encryptedImage.getPixel(i % encryptedImage.getWidth(), i / encryptedImage.getWidth()) == TERMINATION_CHAR) {
                break;
            }
                buffer.add(encryptedImage.getPixel(i % encryptedImage.getWidth(), i / encryptedImage.getWidth()));
        }
        return buffer.stream()
                .map(i -> (char) i.intValue())
                .map(Object::toString)
                .collect(Collectors.joining());
    }

}
