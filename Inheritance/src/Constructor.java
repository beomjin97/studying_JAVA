class Cal {
  int v1, v2;
  
  Cal(int v1, int v2) {
    this.v1 = v1;
    this.v2 = v2;
    System.out.println("Cal init");
  }
}

class Cal2 extends Cal {

  Cal2(int v1, int v2) {
    super(v1, v2);
    System.out.println("Cal2 init");
  }
  
}

public class Constructor {
  public static void main(String[] args) throws Exception {
    Cal c = new Cal(2,1);
    Cal2 c2 = new Cal2(2,1);
  }
}