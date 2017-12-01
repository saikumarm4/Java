package five;

import java.util.HashMap;
import java.util.Map;

public class FirstChartInStringRepeating {

	public static void main(String[] args) {
		final String STRING = "adefghbclkh";
		String firstRepeatingCharacter = "";
		int minimum = STRING.length()*2;
		for (int i = 0; i < STRING.length(); i++) {

			String character = String.valueOf(STRING.charAt(i));
			int indexOfRepeatingValue = STRING.indexOf(character, i + 1);
			if (indexOfRepeatingValue != -1
					&& ((i + indexOfRepeatingValue) < minimum)) {
				minimum = i + indexOfRepeatingValue;
				firstRepeatingCharacter = character;
			}

		}
		System.out.println(firstRepeatingCharacter);

	}
}
