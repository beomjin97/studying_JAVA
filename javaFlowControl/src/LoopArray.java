public class LoopArray {

	public static void main(String[] args) {
		
		String[] users = new String[3];
		users[0] = "A";
		users[1] = "B";
		users[2] = "C";
		
		for (int i = 0; i < users.length; i++) {
			System.out.println("<li>" + users[i] + "</li>");
		}
	}
}
