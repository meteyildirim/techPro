package StructuralDP.FacadeDP;

public class EncryptorFacade {
	// kullanici iki bilgi girecek text ve encryptionmethod...
	private AESEncryptor aes = new AESEncryptor();
	private MD5 md5 = new MD5();
	private SHAEncryptor sha = new SHAEncryptor();
	
	public void encrypt(String text, EncType encType ) { 
		
		switch (encType) {
		case AES: aes.encryptor(text);
			
			break;
			
		case MD5: md5.encryptor(text, "key");
		
		break;
		
		case SHA: md5.encryptor(text, "key");
				
				break;

		default: throw new IllegalArgumentException(encType.toString());
			
		}
	}
	
	
	public enum EncType {
		SHA,
		MD5,
		AES
		
	}

}
