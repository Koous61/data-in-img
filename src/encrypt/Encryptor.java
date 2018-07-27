package encrypt;

//шифрование
public interface Encryptor <B, D> {

	B encrypt(B base, D data);
	
	D decrypt(B encryptedBase);

}
