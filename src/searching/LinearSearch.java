package searching;

import java.util.ArrayList;
import java.util.List;

public class LinearSearch {
	public static void main (String args[]) {
		
		int arr[]=new int[] {1,4,12,2,6,8,3,12,46};
		
		List<Object> indexs=linearSearch(arr,12);
		System.out.println("Found at index: "+indexs);
	}

	private static List<Object> linearSearch(int[] arr, int index) {
	
		List<Object> list=new ArrayList<>();
		for (int i=0; i<arr.length;i++) {
			if(arr[i]==index) {
				list.add(i);
			}	
		}
		return list;
	}
}
