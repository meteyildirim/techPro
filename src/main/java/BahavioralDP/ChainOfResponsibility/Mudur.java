package BahavioralDP.ChainOfResponsibility;

public class Mudur extends Approver {

	public Mudur(Approver chief) {
		super(chief);
		
	}

	@Override
	boolean approveLoan(int amount) {
		
		if(amount<500){
			System.out.println("Mudur onayladi");
			return true;
			
		}else if(chief!=null) {
			System.out.println("Bu miktari mudur onaylayamaz. Sefe yonlediriliyorsunuz");
			return chief.approveLoan(amount);
		}
		return false;
		
		
	}


}
