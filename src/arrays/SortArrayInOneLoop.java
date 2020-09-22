package arrays;

public class SortArrayInOneLoop {
	public static void main(String[] args) {

		int arr[] = new int[] { 25, 5, 3, 4, 4, 4, 4, 4, 5, 6, 35, 7, 15, 9, 9, 25 };
		int sorted[]=sortArray(arr);

		for(int i=0;i<sorted.length;i++) {
			System.out.println(sorted[i]);
		}
	}

	public static int[] sortArray(int arr[]) {

		for(int i=0;i<arr.length;i++) {
			if((i+1)!=arr.length && arr[i]<arr[i+1] ) {
			     int temp=arr[i];
				 arr[i]=arr[i+1];
				 arr[i+1]=temp;
				 i=-1; 
			}	
			
		}	
		return arr;
	}
}