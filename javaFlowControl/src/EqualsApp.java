
public class EqualsApp {

	public static void main(String[] args) {
		
		// primitive type은 값이 같다면 같은 메모리주소를 바라본다.
		int p1 = 1;
		int p2 = 1;
		System.out.println(p1 == p2);  // true
		
		// object type은 별개의 주소를 생성한다.
		String o1 = new String("java");
		String o2 = new String("java");
		System.out.println(o1 == o2);       // false
		System.out.println(o1.equals(o2));  // true
		
		// String은 object type이지만 예외적으로 primitive type처럼 작동한다.
		String str1 = "java2";
		String str2 = "java2";
		System.out.println(str1 == str2);  //true
		System.out.println(str1.equals(str2));  //true

	}

}
