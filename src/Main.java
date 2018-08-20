import binary.Binarization;
import encrypt.Encryptor;
import util.ImageBlueprint;
import util.io.ImageIO;
import util.io.TextIO;

import java.awt.image.BufferedImage;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedImage image = ImageIO.load("img/in/1.jpg");
		
		ImageBlueprint blueprint = Binarization.asImageBlueprint(image);

		String inputUser = TextIO.read("txt/in/txt.txt");

		blueprint = Encryptor.encrypt(blueprint, inputUser);

		BufferedImage image2 = Binarization.asBufferedImage(blueprint);

		String a = Encryptor.decrypt(blueprint);

		TextIO.save(a, "txt/out/txt.txt");

		ImageIO.save(image2, "img/out/1.jpg");
	}
}
