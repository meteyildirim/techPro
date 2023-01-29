package atm.mete;

import java.util.ArrayList;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
	
		String email = "mete@gmail.com";

		
		System.out.println(Validate.isEmailValid(email));
		

		
		
	}

	public static ArrayList login() {
		ArrayList<String> accInfo = new ArrayList<String>(); 
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your Account Number:");
		accInfo.add(scan.next());
		System.out.println("Enter Your PIN Number:");
		accInfo.add(scan.next());		
		return accInfo;
	}

}
