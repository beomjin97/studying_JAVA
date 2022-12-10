public class AccountingApp {
  
  public static double valueOfSupply = 10000.0;
  public static double vatRate = 0.1;
  public static double getVat() {
    return valueOfSupply * vatRate;
  }
  public static double getTotal() {
    return valueOfSupply + getVat();
  }
  public static void main(String[] args) {
    System.out.println("value of supply: " + valueOfSupply);
    System.out.println("VAT : " + getVat());
    System.out.println("Total: " + getTotal());
  }  
}
