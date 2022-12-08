
public class AccountingMethodApp {
	public static double valueOfSupply;
	public static double vatRate;
	public static double expenseRate;

	public static void main(String[] args) {
		valueOfSupply = Double.parseDouble(args[0]);
		vatRate = 0.1;
		expenseRate = 0.3;
		print();
	}

	public static double getVat() {
		return valueOfSupply * vatRate;
	}
	
	public static double getTotal() {
		return valueOfSupply + getVat();
	}
	
	public static double getExpense() {
		return valueOfSupply * expenseRate;
	}
	
	public static double getIncome() {
		return valueOfSupply - getExpense();
	}
	
	public static double getDiviend1() {
		return getIncome() * 0.5;
	}
	
	public static double getDiviend2() {
		return getIncome() * 0.3;
	}

	public static double getDiviend3() {
		return getIncome() * 0.2;
	}
	public static void print() {
		System.out.println("Value of supply: " + valueOfSupply);
		System.out.println("VAT: " + getVat());
		System.out.println("Total: " + getTotal());
		System.out.println("Expense: " + getExpense());
		System.out.println("Income:" + getIncome());
		System.out.println("dividened1: " + getDiviend1());
		System.out.println("dividened2: " + getDiviend2());
		System.out.println("dividened3: " + getDiviend3());
	}

}
