package com.qa.SentenceReduction;

public class Runner {

	public static void main(String args[]) {

		wordMerge("Digital alarm clocks scare area children .");
		wordMerge("I heard the pastor sing live verses easily.");
		wordMerge("Deep episodes of Deep Space Nine came on the television only after the news.");
		wordMerge("Boot ootter.");
		wordMerge("map map map map.");
		

	}

	public static void wordMerge(String sentence) {

		int wordLength = 0;

		for (int i = 0; i <= sentence.length() - 1; i++) {

			// System.out.println(String.valueOf(sentence.charAt(i)));

			if (sentence.charAt(i) == ' ') {

				int trimLength = 1;
				loop: for (int j = wordLength; j > 0; j--) {

					//for (int k = 0; k <= wordLength; k++) {
						if (sentence.charAt(i - j) == sentence.charAt(i + trimLength)
								&& sentence.charAt(i - j + 1) != sentence.charAt(i + trimLength + 1)
								&& sentence.charAt(i - j + 1) != ' ') {
							trimLength = 1;
							continue;
						}
					//}
					if (sentence.charAt(i - j) == sentence.charAt(i + trimLength)) {

						trimLength++;
						continue loop;
					}

					trimLength = 1;

				}

				if (trimLength == 1) {

					trimLength = 0;
				}

				String before = sentence.substring(0, i);
				String after = sentence.substring(i + trimLength);
				sentence = before + after;
				wordLength = -1;

			}
			wordLength++;

		}
		System.out.println(sentence);

	}

}





