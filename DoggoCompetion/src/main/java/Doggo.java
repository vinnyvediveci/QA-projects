import java.util.ArrayList;

public class Doggo {

	public static String[] myList2 = { " ", "first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth",
			"ninth", "tenth" };
	static String[] myList3 = { "eleventh", "twelfth", "thirteenth", "fourteenth", "fifteenth", "sixteenth",
			"seventeenth", "eighteenth", "nineteenth" };
	static String[] myList4 = { "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety",
			"hundred" };
	String[] myList5 = { "twentieth", "thirtieth", "fourtieth", "fiftieth", "sixtieth", "seventieth", "eightieth",
			"ninetieth", " one hundredth" };

	public static void dogCompetition(int X) {
		ArrayList<String> dogList = new ArrayList<String>();

		int i;
		for (i = 1; i <= 10; i++) {
			dogList.add(myList2[i]);
		}
		for (i = 11; i <= 19; i++) {
			dogList.add(myList3[i - 11]);
		}
		for (i = 20; i < 101; i++) {
			int j = i % 10;
			int k = i / 10;
			dogList.add(myList4[k - 2] + myList2[j]);
		}
		dogList.remove(X - 1);
		System.out.println(dogList);
	}
}
