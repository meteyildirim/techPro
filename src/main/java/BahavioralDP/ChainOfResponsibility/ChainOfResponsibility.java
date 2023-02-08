package BahavioralDP.ChainOfResponsibility;

public class ChainOfResponsibility {

	public static void main(String[] args) {
		
		chainOFResponsibilityDemo();
		

	}
	
	static void  chainOFResponsibilityDemo() {
		
		Approver genelMudur = new GenelMudur();
		Approver mudur = new Mudur(genelMudur);
		Approver memur = new Memur(mudur);
		
		System.out.println("Kredi verme limitleri");
		System.out.println("Memur icin maksimum: <100");
		System.out.println("Mudur icin maksimum: <500");
		System.out.println("Genel mudur icin sinir yok");
		memur.approveLoan(50);
		memur.approveLoan(150);
		mudur.approveLoan(200);
		mudur.approveLoan(2000);
		genelMudur.approveLoan(50);
		
		
	}

}
