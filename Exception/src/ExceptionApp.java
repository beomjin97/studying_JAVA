public class ExceptionApp {
    public static void main(String[] args) {
        // try {
        //     System.out.println(2/0);
        // } catch (ArithmeticException e) {
        //     System.out.println("잘못된 계산이에요");
        // }

        // int [] scores = {10, 20, 30};
        // try {
        //     System.out.println(scores[3]);
        // } catch (ArrayIndexOutOfBoundsException e) {
        //     System.out.println("범위 초과에요");
        // }

        try {
            System.out.println(2/0);
        } 

        int [] scores = {10, 20, 30};
        try {
            System.out.println(scores[3]);
        } catch (ArithmeticException e) {
            System.out.println("잘못된 계산이에요");
        }
        
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("범위 초과에요");
        }
    }
}
