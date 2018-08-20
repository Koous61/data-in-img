package binary;

import util.ImageBlueprint;

import java.awt.image.BufferedImage;

public class Binarization {
	
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

	public static int[] toBytes(String data) {
		int[] result = new int[data.length()]; //Used to store our ints

		for (int i = 0; i < data.length(); i++) {
			result[i] = data.charAt(i);
		}
		return result;
	}

	public static String fromBytes(int[] data) {
		StringBuilder result = new StringBuilder();

		for (int ch : data) {
			result.append((char) ch);
		}

		return result.toString();
	}


}
