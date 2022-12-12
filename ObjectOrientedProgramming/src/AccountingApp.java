class Accounting {
  // 공급가
  public double valueOfSupply ; 
  // 부가가치세율 
  public static double vatRate = 0.1;
  
  public Accounting(double valueOfSupply) {
    this.valueOfSupply = valueOfSupply;
  }
  
  public double getVat() {
    return valueOfSupply * vatRate;
  }
  public double getTotal() {
    return valueOfSupply + getVat();
  }
}

public class AccountingApp {
  public static void main(String[] args) {

    Accounting a1 = new Accounting(10000.0);
    Accounting a2 = new Accounting(20000.0);

    System.out.println("Value of supply: " + a1.valueOfSupply);
    System.out.println("Value of supply: " + a2.valueOfSupply);

    System.out.println("VAT: " + a1.getVat());
    System.out.println("VAT: " + a2.getVat());

    System.out.println("Total: " + a1.getTotal());
    System.out.println("Total: " + a2.getTotal());
  }  
}
