package io;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageIO {
	
	public static BufferedImage load(String path) throws IOException {
		return javax.imageio.ImageIO.read(new File(path));
	}
	
	public static Boolean save(BufferedImage image, String path) throws IOException {
		File outputFile = new File(path);
		outputFile.getParentFile().mkdirs();
		javax.imageio.ImageIO.write((BufferedImage) image, "jpg", outputFile);
		return null;
	}
	
}
