package creationaldesign.prototypedp;

public class ProtypeDemo {

	public static void main(String[] args) {
		
		Soldier availableSoldier = new Soldier(100, 45, 20, 50, 60, 5, "Sword", true);
		
//		Soldier notavailableSoldier = new Soldier(100, 45, 20, 50, 60, 5, "Sword", false);
		
		Soldier notavailableSoldier2 = (Soldier) availableSoldier.clone();
		
		notavailableSoldier2.setAvailableForWar(false);
		
		System.err.println("Soldier info:");
		notavailableSoldier2.showSoldierInfo();
		System.err.println("Soldier info:");
		availableSoldier.showSoldierInfo();

	}

}
