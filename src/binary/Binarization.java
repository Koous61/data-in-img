package binary;

import java.io.IOException;

//создания байт-кода даты
public interface Binarization<D> {
	
	byte[] asBinary(D data) throws IOException;
	
	D asImage(byte[] bytes);
	
}
