package binary;

public interface Binarization<D> {

	byte[] asBinary(D data);
	
	D asImage(byte[] bytes);

}
