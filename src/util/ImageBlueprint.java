package util;

import java.awt.image.BufferedImage;

public class ImageBlueprint {
	
	private int width;
	private int height;
	private int[][] pixels;
	
	public ImageBlueprint(int width, int height, int[][] pixels) {
		this.width = width;
		this.height = height;
		this.pixels = pixels;
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
	
	public int[][] getPixels() {
		return pixels;
	}
	
	public static int[][] toPixelArray(BufferedImage image) {
		int width = image.getWidth();
		int height = image.getHeight();
		
		int[][] pixels = new int[width][height];
		
		for (int i = 0; i < width; i++)
			for (int j = 0; j < height; j++)
				pixels[i][j] = image.getRGB(i, j);
			
			return pixels;
	}
	
	public void setPixel(int i, int j, int value) {
		pixels[i][j] = value;
	}
}
