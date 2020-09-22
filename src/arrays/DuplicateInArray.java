package arrays;

import java.util.ArrayList;

public class DuplicateInArray {
	public static void main(String[] args) {

		int arr[] = new int[] { 25, 5, 3, 4, 4, 5, 6, 35, 7, 15, 9 };
		ArrayList<Object> duplicateList = findDuplicateInArray(arr);
		System.out.println(duplicateList);

	}
	public static ArrayList<Object> findDuplicateInArray(int arr[]) {
		ArrayList<Object> duplicate = new ArrayList<Object>();
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					duplicate.add(arr[i]);
				}
			}

		}
		return duplicate;
	}
}
