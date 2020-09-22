package searching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinarySearch {

	public static void main(String args[]) {
		int arr[] = new int[] { 1, 4, 12,3,4, 2, 6, 8, 3, 22, 46 };
		Arrays.sort(arr);
		List<Object> indexs =binarySearch(arr, 12);
		System.out.println("Found at index: " + indexs);
	}

	private static List<Object> binarySearch(int[] arr, int value) {
		int p=0;
		int r=arr.length-1;
		int q=(p+r)/2;
		List<Object> list=new ArrayList<>();
		while(p<=r) {
			if(value<arr[q]) {
				r=q;
				q=(p+r)/2;
			}
			else if(value>arr[q]) {
				p=q+1;
				q=(p+r)/2;
			}
			else {
				list.add(q);
				break;
			}
		}
		return list;
	}
}