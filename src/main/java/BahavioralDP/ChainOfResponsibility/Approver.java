package BahavioralDP.ChainOfResponsibility;

public abstract class Approver {
	
	// butun memur, mudur, genel memur buradan tureyecek
	// o zama sefi belirleyecek bir field olmasi lazim
	// memeru oustururken sefini belirleyecegiz
	
	Approver chief;// sefde aslinda bir Approver oldugu icin.

	public Approver(Approver chief) { // bundan olusturken ustu olusturmayi zorunlu yaptik
		this.chief = chief;
	}
	
	
	abstract boolean approveLoan(int amount); // buda ksinin yetklil miktadir... belirleyecek
	

}
