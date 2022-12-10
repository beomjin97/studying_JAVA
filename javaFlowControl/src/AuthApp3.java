public class AuthApp3 {
  public static void main(String[] args) {
    
    //String[] users = {"A", "B", "C"};
    String[][] users = {
      {"A", "1111"},
      {"B", "2222"}, 
      {"C", "3333"}
    };

    String inputId = args[0];
    String inputPass = args[1];

    boolean isLoggedIn = false;
    for (int i=0; i<users.length; i++) {
      String[] current = users[i];
      if (current[0].equals(inputId) && current[1].equals(inputPass)) {
        isLoggedIn = true;
        break;
      }
    }

    if(isLoggedIn) {
      System.out.println("Master!!");
    } else {
      System.out.println("who are you?");
    }
  }
}
