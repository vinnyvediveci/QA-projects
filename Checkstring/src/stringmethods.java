
public class stringmethods {

	public static void main(String[] args) {
		System.out.println(checkStringMatch("Hello"));
		System.out.println(checkTwoStringMatch("That", "That"));
	}
	
	public static boolean checkStringMatch(String a) {
	if (a == "Hello") {
		return true;
	} else {
			return false;
		   }
	}
	
	public static boolean checkTwoStringMatch(String a, String b) {
		if (a == b) {
			return true;
		} else {
			return false;
		}
		
	}
}
