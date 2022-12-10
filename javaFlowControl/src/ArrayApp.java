
public class ArrayApp {

	public static void main(String[] args) {
		
		String[] users = new String[3];
		users[0] = "A";
		users[1] = "B";
		users[2] = "C";
		
		System.out.println(users[1]);   // B
		System.out.println(users.length);  // 3
		
		int[] score = {10, 100, 1000};
		
		System.out.println(score[1]); // 100
		System.out.println(score.length);  // 3
	}

}
