package sorting;

public class MergeSort {

	public static void main(String[] args) {

		int A[] = new int[] { 1, 5, 2, 7, 3, 8, 5, 9, 4, 6 };
		int P = 0;
		int R = A.length-1;
		mergeSort(A, P, R);
		for(int i = 0; i <= R; i++) {
			System.out.println(A[i]);
		}
	}

	private static void mergeSort(int[] A, int P, int R) {
		if (R <= P) {
			return;
		}
		int Q = (P + R) / 2;
		mergeSort(A, P, Q);
		mergeSort(A, Q + 1, R);
		merge(A, P, Q, R);

	}

	private static void merge(int[] A, int P, int Q, int R) {
		int tempArray[] = new int[R - P + 1];
		int i = P;
		int j = Q + 1;
		int k = 0;
		while (i <= Q && j <= R) {
			if (A[i] < A[j])
				tempArray[k++] = A[i++];
			else
				tempArray[k++] = A[j++];
		}
		while (i <= Q) {
			tempArray[k++] = A[i++];
		}
		while (j <= R) {
			tempArray[k++] = A[j++];

		}
		for (int x = 0; x < tempArray.length; x++) {
			A[P + x] = tempArray[x];
		}
	}
}
