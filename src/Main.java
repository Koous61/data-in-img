import binary.ImageBinarization;
import io.ImageIO;
import util.ImageBlueprint;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedImage image = ImageIO.load("img/in/1.jpg");
		
		ImageBlueprint blueprint = ImageBinarization.asImageBlueprint(image);
		
		//test
		for (int i = 0; i < 10000000; i++) {
			blueprint.setPixel(new Random().nextInt(blueprint.getWidth()), new Random().nextInt(blueprint.getHeight()), 255);
		}
		
		BufferedImage image2 = ImageBinarization.asBufferedImage(blueprint);
		
		ImageIO.save(image2, "img/out/1.jpg");
	}
}
