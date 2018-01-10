import java.util.Arrays;

public class PangramPractise {

	public static void main(String[] args) {
		String word = "The QUICK brown fox jumps over the lazy dog";
		checkPangram(word);
	}

	static void checkPangramTrivial(String word) {
		// String word = "The QUIC brown fox jumps over the lazy dog";
		String copyOfWord = word.toLowerCase();
		String englishLetter = "";
		for (int i = 97; i <= 122; i++)
			englishLetter += String.valueOf((char) i);

		boolean pangram = true;
		for (int i = 0; i < 26; i++) {
			int index = copyOfWord.indexOf(String.valueOf(englishLetter
					.charAt(i)));
			if (index == -1) {
				pangram = false;
				break;
			}
		}

		if (pangram) {
			System.out.println("pangram");

		} else
			System.out.println("not pangram");
	}

	static void checkPangram(String word) {
		boolean[] markUp = new boolean[26];
		char charHolder = '$';
		int index = -1;

		Arrays.fill(markUp, false);
		for (int i = 0; i < word.length(); i++) {
			charHolder = word.charAt(i);
			if (charHolder >= 'a' && charHolder <= 'z') {
				index = charHolder - 'a';
			} else if (charHolder >= 'A' && charHolder <= 'Z') {
				index = charHolder - 'A';
			}
			markUp[index] = true;
		}

		for (int i = 0; i < 26; i++) {
			if (markUp[i] == false) {
				System.out.println("not pangram");
				return;
			}
		}
		System.out.println("Pangram");
	}
}
