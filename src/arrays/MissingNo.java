package arrays;

public class MissingNo {

	public static void main(String args[]) {

		int arr[] = new int[] { 2, 4, 5, 3, 6, 7, 1, 9 };
		int n = arr.length + 1;
		int missionNo = findMissingNoFromArray(arr,n);
		System.out.println("Missing No : " + missionNo);
	}

	private static int findMissingNoFromArray(int[] arr,int n) {

		
		int sum = (n * (n + 1)) / 2;
		for (int i = 0; i < n - 1; i++) {
			sum = sum - arr[i];
		}

		return sum;
	}

}
