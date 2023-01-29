package atm.mete;

import java.util.Scanner;

public class CreateAccount {
	

	private String accNo;
	private String accPin;
	private String email;
	
	public CreateAccount() {
		super();
		Scanner scan = new Scanner( System.in);
		System.out.println("Enter 11 digit account no:");
		this.accNo = scan.next();
		System.out.println("Enter 8 digit PIN no:");		
		this.accPin = scan.next();
		System.out.println("Enter your Email:");		
		this.accPin = scan.next();
	}
	
	public String getAccNo() {
		return accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public String getAccPin() {
		return accPin;
	}

	public void setAccPin(String accPin) {
		this.accPin = accPin;
	}	
	
	

}
