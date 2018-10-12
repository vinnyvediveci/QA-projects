
public class Calculations {
	public static void main(String[] args) {
		/*
		 * System.out.println(addTwo(13, 14)); System.out.println(multiplyTwo(2, 4));
		 * System.out.println(subtractTwo(116, 3)); System.out.println(divideTwo(50,
		 * 4));
		 */
		System.out.println(calculator(18, 2, " * "));

	}

	public static int calculator(int a, int b, String operator) {
		if (operator == " + ") {
			int x = a + b;
			return x;
		} else if (operator == " * ") {
			int x = a * b;
			return x;
		} else if (operator == " - ") {
			int x = a - b;
			return x;
		} else if (operator == " / ") {
			int x = a / b;
			return x;
		} else {
			System.out.println("invalid syntax");
			return 0;
		}

	}
}
