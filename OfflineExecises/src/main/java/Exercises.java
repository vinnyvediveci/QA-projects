
public class Exercises {
	public static void main(String[] args) {
		multChar("h");
		getBert("xxbertfridgebertyy");
	}
	// Given a string, return a string where
		// for every char in the original string,
		// there are three chars.

		// multChar("The") → "TTThhheee"
		// multChar("AAbb") → "AAAAAAbbbbbb"
		// multChar("Hi-There") → "HHHiii---TTThhheeerrreee"

		public static String multChar(String input) {
		String result = "";
			
			for(int i = 0; i < input.length(); i++) {
				result += input.substring(i, i+1) + input.substring(i, i+1) + input.substring(i, i+1);
				System.out.println(result);
			} return result;
 }
		
		//
		// Return the string (backwards) that is between the first and last appearance
		// of "bert"
		// in the given string, or return the empty string "" if there is not 2
		// occurances of "bert" - Ignore Case

		// getBert("bertclivebert") → "elivc"
		// getBert("xxbertfridgebertyy") → "egdirf"
		// getBert("xxBertfridgebERtyy") → "egdirf"
		// getBert("xxbertyy") → ""
		// getBert("xxbeRTyy") → ""

		public static String getBert(String input) {
			
			String between = "";
		    String end = "";
			
			between = input.substring(input.indexOf("bert") + 4, input.lastIndexOf("bert"));
			    
			
			System.out.println(between);
			
			String out = new StringBuilder(between).reverse().toString();
			System.out.println(out);
			return out;
			
			

		
		}
		
}