package io;


public interface ImageIO <I> {

	I load(String path);
	
	Boolean save(String path);

}
