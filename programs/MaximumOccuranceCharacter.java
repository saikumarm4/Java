package five;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaximumOccuranceCharacter {

	public static void main(String[] args) {
		Integer[] character = new Integer[26];
		Arrays.fill(character, 0);
		String word = "testt";
		String copyOfWord = word.toLowerCase();

		int index = -1;

		for (int i = 0; i < copyOfWord.length(); i++) {
			index = copyOfWord.charAt(i) - 'a';
			character[index] += 1;
		}

		List list = Arrays.asList(character);
		int maximumValue = Collections.max(list);
		System.out.println((char) (list.indexOf(maximumValue) + 97));

	}

}
