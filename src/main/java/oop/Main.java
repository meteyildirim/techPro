package oop;

public class Main {

	public static void main(String[] args) {

		// Create user

		Budget anne = new Budget();
		Budget baba = new Budget();

		System.out.println("Current Budget:" + Budget.budget);
		System.out.println("Anne maas aldi");
		anne.setIncome(1000);
		System.out.println("Current Budget:" + Budget.budget);
		System.out.println("Baba maas aldi");
		baba.setIncome(1500);
		System.out.println("Current Budget:" + Budget.budget);
		System.out.println("anne harcama yapti");
		anne.setOutcome(50);
		System.out.println("Current Budget:" + Budget.budget);
		System.out.println("baba harcama yapti");
		baba.setOutcome(150);
		System.out.println("Current Budget:" + Budget.budget);
		System.out.println("Anne income:" + anne.getIncome());
		System.out.println("Baba income:" + baba.getIncome());
		System.out.println("Anne outcome:" + anne.getOutcome());
		System.out.println("Baba outcome:" + baba.getOutcome());

	}

}
