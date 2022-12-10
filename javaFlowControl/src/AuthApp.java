

public class AuthApp {

	public static void main(String[] args) {
		
		String id = "beomjin";
		String inputId = args[0];
		
		String pwd = "1111";
		String inputPass = args[1];
		
		System.out.println("Hi!");
		;
		
//		if (inputId == id) {
		if (inputId.equals(id) && inputPass.equals(pwd)) {				
			System.out.println("Master");
		} else {
			System.out.println("Who are you?");
		}

	}

}
