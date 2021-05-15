package nikhil.tripathy.sorting;
/*
 * Quick sort implementation.
 * */

public class QuickSort {
	static int call = 1;
	public static void main(String...strings) {
		int arr[] = {2,8,7,1,3,5,6,4};
		
		quicksort(arr,0,arr.length);
		for (int a : arr) {
			System.out.print(a + " ");
		}
	}
	
	public static void quicksort(int[] arr, int p, int r) {
		if (p<r) {		
			int q = partition (arr, p, r);
			quicksort(arr, p, q);
			quicksort(arr, q+1, r);
		}
	}
	
	public static int partition(int[] arr, int p, int r) {
		
		int x = arr[r-1];
		int i = p-1;
		int temp = 0;
		//Loop till last but one element,else last element will be copied twice
		for (int j=p; j<r-1; j++) {
			if (arr[j] <= x) {
				i++;
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		//i++;
		temp = arr[i+1];
		arr[i+1] = arr[r-1];
		arr[r-1] = temp;
		return i+1;
	}
}
