package oop;

public class Budget {

	int income;
	int outcome;
	static int budget;

	public Budget() {
		this.income = 0;
		this.outcome = 0;
	}

	public int getIncome() {

		return income;
	}

	public void setIncome(int income) {
		this.income = income;
		addToBudget(income);
	}

	public int getOutcome() {
		return outcome;
	}

	public void setOutcome(int outcome) {
		this.outcome = outcome;
		subFromBudget(outcome);

	}

	public static int getBudget() {
		return budget;
	}

	public static void addToBudget(int income) {
		Budget.budget = Budget.budget + income;
	}

	private static void subFromBudget(int income) {
		Budget.budget = Budget.budget - income;
	}

}
