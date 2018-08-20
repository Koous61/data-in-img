import binary.Binarization;
import encrypt.Encryptor;
import io.ImageIO;
import util.ImageBlueprint;

import java.awt.image.BufferedImage;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedImage image = ImageIO.load("img/in/1.jpg");
		
		ImageBlueprint blueprint = Binarization.asImageBlueprint(image);

		String inputUser = "gerghehderyrtfhfgthfghdghsdgrrsgfsrsdfgbfreryhtrhjutregfwefuigwefuwerghkierui";

		blueprint = Encryptor.encrypt(blueprint, inputUser);

		BufferedImage image2 = Binarization.asBufferedImage(blueprint);

		String a = Encryptor.decrypt(blueprint);

		System.out.println(a);

		ImageIO.save(image2, "img/out/1.jpg");
	}
}
