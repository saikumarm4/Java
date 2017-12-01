package five;

import java.util.ArrayList;

public class StringSplitPractise {

	public static void main(String[] args) {
		String word = "g  eeeeeksfor ge  eeks  ";
		StringBuilder wordWithoutSpace = new StringBuilder("");
		for (int i = 0; i < word.length(); i++) {
			if (Character.isWhitespace(word.charAt(i)))
				continue;
			else
				wordWithoutSpace.append(word.charAt(i));
		}
		
		System.out.println(wordWithoutSpace.toString());

	}

	static void splitString(String word) {
		// String word = "1,29,3,4232,5,6,7,8,killingit";
		ArrayList<String> words = new ArrayList<String>();
		char splitCharacter = ',';
		StringBuilder splitword = new StringBuilder("");
		char tempCharacter = '$';
		for (int i = 0; i < word.length(); i++) {
			tempCharacter = word.charAt(i);
			if (tempCharacter == splitCharacter) {
				words.add(splitword.toString());
				splitword = new StringBuilder("");
			} else {
				splitword.append(tempCharacter);
			}
		}

		for (String s : words) {
			System.out.println(s);
		}
	}

}
