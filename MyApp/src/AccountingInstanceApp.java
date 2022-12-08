class Account {
	public double valueOfSupply;
	public double vatRate;
	public double expenseRate;
	
	public double getVat() {
		return valueOfSupply * vatRate;
	}
	
	public double getTotal() {
		return valueOfSupply + getVat();
	}
	
	public double getExpense() {
		return valueOfSupply * expenseRate;
	}
	
	public double getIncome() {
		return valueOfSupply - getExpense();
	}
	
	public double getDiviend1() {
		return getIncome() * 0.5;
	}
	
	public double getDiviend2() {
		return getIncome() * 0.3;
	}

	public double getDiviend3() {
		return getIncome() * 0.2;
	}
	
	public void print() {
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

public class AccountingInstanceApp {
	
	public static void main(String[] args) {
		Account a1 = new Account();
		a1.valueOfSupply = 10000.0;
		a1.vatRate = 0.1;
		a1.expenseRate = 0.3;
		a1.print();
		
		Account a2 = new Account();
		a2.valueOfSupply = 20000.0;
		a2.vatRate = 0.05;
		a2.expenseRate = 0.2;
		a2.print();
	}

	

}
