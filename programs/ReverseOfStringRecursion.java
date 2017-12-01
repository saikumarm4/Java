package five;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseOfStringRecursion {

	public static void main(String[] args) {
		String word = "F#IBON$OCI";
		char[] characterSequence = word.toCharArray();
		int i = 0, j = word.length() - 1;
		while (i < j) {
			if (!(characterSequence[i] >= 'A' && characterSequence[i] <= 'Z'))
				i++;
			else if (!(characterSequence[j] >= 'A' && characterSequence[j] <= 'Z'))
				j--;
			else {

				swap(characterSequence, i, j);
				i++;
				j--;
			}

		}
		System.out.println(characterSequence);

	}

	static void swap(char[] characterSequence, int i, int j) {
		char temp = characterSequence[i];
		characterSequence[i] = characterSequence[j];
		characterSequence[j] = temp;
	}

	static String reverseOfString(String word, int index) {
		if (index >= 0)
			return String.valueOf(word.charAt(index))
					+ reverseOfString(word, index - 1);
		return "";
	}

	static void reverseAStringWithSpecialCharacterWithArrays(String word) {
		ArrayList<Character> characterSequence = new ArrayList<Character>();
		String specialCharacter = "!@#$%^&*()";
		String characterOfString = "";
		for (int i = 0; i < word.length(); i++) {
			characterOfString = String.valueOf(word.charAt(i));
			int index = specialCharacter.indexOf(characterOfString, 0);
			if (index == -1)
				characterSequence.add(characterOfString.charAt(0));
		}

		Collections.reverse(characterSequence);
		for (int i = 0; i < word.length(); i++) {
			characterOfString = String.valueOf(word.charAt(i));
			int index = specialCharacter.indexOf(characterOfString, 0);
			if (index != -1)
				characterSequence.add(i, characterOfString.charAt(0));
		}

		for (Character c : characterSequence) {
			System.out.print(String.valueOf(c));
		}
	}

	static void reverseStringSC(String word) {
		int LENGTH_OF_STRING = word.length();
		char[] characterArray = new char[LENGTH_OF_STRING];
		String specialCharacter = "!@#$%^&*()";
		String characterOfString = "";
		int j = 0;

		for (int i = 0; i < LENGTH_OF_STRING; i++) {
			characterOfString = String.valueOf(word.charAt(i));
			int index = specialCharacter.indexOf(characterOfString);
			if (index == -1)
				characterArray[j++] = characterOfString.charAt(0);

		}

		reverseCharacter(characterArray, j);

		for (int i = 0; i < LENGTH_OF_STRING; i++) {
			characterOfString = String.valueOf(word.charAt(i));
			int index = specialCharacter.indexOf(characterOfString);
			if (index != -1)
				moveCharacter(characterArray, characterOfString.charAt(0), i,
						LENGTH_OF_STRING);

		}
		System.out.println(characterArray);
	}

	static void moveCharacter(char[] characterSequence, char character, int j,
			int length) {
		int i = length - 1;
		while (i > j) {
			characterSequence[i] = characterSequence[i - 1];
			i--;
		}
		characterSequence[j] = character;
	}

	static void reverseCharacter(char[] characterSequence, int length) {
		for (int i = 0; i < length / 2; i++) {
			char temp = characterSequence[i];
			characterSequence[i] = characterSequence[length - i - 1];
			characterSequence[length - i - 1] = temp;
		}
	}

}
