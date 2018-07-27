package io;

import java.io.IOException;

public interface ImageIO <I> {

	I load(String path) throws IOException;
	
	Boolean save(I data, String path) throws IOException;

}
