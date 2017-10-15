package five;

import java.util.ArrayList;

public class PermutationPractise {

	public static void main(String[] args) {
		String[][] data = { { "A", "B", "C" }, { "1", "2" }, { "3", "4", "5" } };
		ArrayList<ArrayList<String>> permutation = new ArrayList<ArrayList<String>>();
		permutation = permute(data, permutation, 0);

		System.out.println("Size : " + permutation.size());
		for (ArrayList<String> temp : permutation) {
			System.out.println(temp);
		}

	}

	static ArrayList<ArrayList<String>> permute(String[][] data,
			ArrayList<ArrayList<String>> permutation, int i) {
		if (i == 0) {
			for (int j = 0; j < data[i].length; j++) {
				ArrayList<String> temp = new ArrayList<String>();
				temp.add(data[i][j]);
				permutation.add(temp);
			}
			return permute(data, permutation, i + 1);
		} else if (i < data.length) {
			ArrayList<ArrayList<String>> tempPermutation = new ArrayList<ArrayList<String>>();
			for (int j = 0; j < data[i].length; j++) {
				for (int k = 0; k < permutation.size(); k++) {
					@SuppressWarnings("unchecked")
					ArrayList<String> temp = (ArrayList<String>) permutation
							.get(k).clone();
					temp.add(data[i][j]);
					tempPermutation.add(temp);
				}
			}
			return permute(data, tempPermutation, i + 1);
		}
		return permutation;
	}
}
