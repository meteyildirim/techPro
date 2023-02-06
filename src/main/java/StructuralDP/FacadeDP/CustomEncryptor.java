package StructuralDP.FacadeDP;

import StructuralDP.FacadeDP.EncryptorFacade.EncType;

public class CustomEncryptor {

	public static void main(String[] args) {
		
		/// kotu kod 
		
		String text = "Content"; // kullanicin girdigi farz et.
		AESEncryptor aes = new AESEncryptor();
		aes.encryptor(text);
		
		MD5 md5 = new MD5();
		md5.encryptor(text, "secretKey");
		
		SHAEncryptor sha = new SHAEncryptor();
		sha.encryptor(text, "secretKey", false);
		
		// yukaridaki yontem cok cazip degill... secretkey istemesi gereksiz... 
		// kullanicidan her yontem icin farkli datalar istemesi iyi degil
		// bunun icin FacadeDP en optimal dir...
		
		// Kotu kod 
		
		// FacadeDP der ki: kullaniciyi  tamamen ayiriz..
		
		System.out.println("facade class kullan");
		EncryptorFacade encFacade = new EncryptorFacade();
		encFacade.encrypt("sifrenelecek text", EncType.AES);
		

	}

}
