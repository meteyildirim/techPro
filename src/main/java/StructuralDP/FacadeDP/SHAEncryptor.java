package StructuralDP.FacadeDP;

public class SHAEncryptor {

	public void encryptor(String text, String key, boolean type) {
		
		// bi nane degil, sadece farkli classlar olsturmaya calistikk
		if (type) {
		
		System.out.println("SHA: "+ text + key  + " SHA");
		
		}
		else
		{
			System.out.println("SHA: "+ key + text  + " SHA");
		}
	}

}
