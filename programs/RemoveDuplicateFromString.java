public class RemoveDuplicateFromString {

	public static void main(String[] args) {
		String word = "ABCDEFABC";
		String finalWord = "";
		for(int i =0; i < word.length(); i++){
			String characterFromOriginal = String.valueOf(word.charAt(i));
			if(finalWord.indexOf(characterFromOriginal) == -1){
				finalWord += characterFromOriginal;
			}
		}
		System.out.println(finalWord);
	}

}
