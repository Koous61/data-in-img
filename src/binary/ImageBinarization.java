package binary;

import util.ImageBlueprint;

import java.awt.image.BufferedImage;

public class ImageBinarization {
	
	public static ImageBlueprint asImageBlueprint(BufferedImage image) {
		return new ImageBlueprint(image.getWidth(), image.getHeight(), ImageBlueprint.toPixelArray(image));
	}
	
	public static BufferedImage asBufferedImage(ImageBlueprint blueprint) {
		
		BufferedImage bufferedImage = new BufferedImage(blueprint.getWidth(), blueprint.getHeight(), BufferedImage.TYPE_INT_RGB);
		for (int i = 0; i < blueprint.getPixels().length; i++) {
			for (int j = 0; j < blueprint.getPixels()[0].length; j++) {
				int pixel=blueprint.getPixels()[i][j];
				bufferedImage.setRGB(i, j, pixel);
			}
		}
		
		return bufferedImage;
	}
	
}
