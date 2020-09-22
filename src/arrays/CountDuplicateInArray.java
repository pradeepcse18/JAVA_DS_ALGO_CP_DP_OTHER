package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class CountDuplicateInArray {
	public static void main(String[] args) {

		int arr[] = new int[] { 25, 5, 3, 4, 4, 4, 4, 4, 5, 6, 35, 7, 15, 9, 9, 25 };
		Arrays.sort(arr);
		findDuplicateInArray(arr);

	}

	public static ArrayList<Object> findDuplicateInArray(int arr[]) {
		ArrayList<Object> duplicate = new ArrayList<Object>();
		int count = 1;
		boolean isDupl = false;
		for (int i = 0; i < arr.length; i++) {
			if ((i + 1 != arr.length && arr[i] == arr[i + 1])) {
				count = count + 1;
				isDupl = true;
				continue;
			}
			if (isDupl) {
				System.out.println(arr[i] + " exists " + count + " times");
				isDupl = false;
				count = 1;
			}
		}
		return duplicate;
	}
}
