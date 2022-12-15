class Cal {
    public int sum(int v1, int v2) {
        return v1 + v2;
    }
    // overloading
    public int sum(int v1, int v2, int v3) {
        // this : current instance of the method
        return this.sum(v1 + v2) + v3;
    }
}

class ExtendedCal extends Cal { 
    public int minus (int v1, int v2) {
        return v1 - v2;
    }
    // overriding
    public int sum(int v1, int v2) {
        System.out.println("ExtendedCal");
        // super: parent's class
        return super.sum(v1 + v2);
    }
}

public class InheritanceApp {
    public static void main(String[] args) throws Exception {
        Cal c = new Cal();
        System.out.println(c.sum(1, 2));
        System.out.println(c.sum(1,2,3));


        ExtendedCal c2 = new ExtendedCal();
        System.out.println(c2.sum(1, 2));
        System.out.println(c2.minus(1, 2));
    }
}
