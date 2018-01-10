public class RemoveDuplicateWordsCaseInsensitive {

	public static void main(String[] args) {
		//String str = "Goodbye bye Bye bye world world world";
		//String str = "I love Love to To tO code";
		//String str = "Sam went went to to to his business";
		//String str = "Reya is is the the best player in eye eye game";
		String str = "in inthe";
		String[] splitString = str.split("\\s+");
		String finalString = "";
		String temp = "";
		for (String word : splitString) {
			temp = finalString.toLowerCase();
			if (temp.indexOf(word.toLowerCase()) == -1) {
				finalString += word + " ";
			}
		}

		System.out.println(finalString);
	}
}
