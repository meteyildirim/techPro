package atm.mete;

public class Validate {
	
	public static boolean isEmailValid(String email) {		
		if (!email.contains("@") || (!email.contains("."))){			
			return false;			
		}else if((email.substring(0,email.indexOf("@")).length()<4)){			
			return false;
	}
		return true;
  
	}
}

