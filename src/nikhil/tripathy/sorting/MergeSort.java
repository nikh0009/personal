package nikhil.tripathy.sorting;
//Practice for merge sort.. divide and conquer O(nlogn) runtime, used aux space

public class MergeSort {
	public static void main (String...strings) {
		//Some unsorted array for sorting
		int arr[] = {9,8,7,6,5,4,3,2,1};
		mergeSort(arr, 0, arr.length-1);
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
	
	public static void mergeSort(int arr[],int l, int r) {
		
		
		if (l < r) {			
			int m = l + (r-l)/2;
			mergeSort(arr, l, m);
			mergeSort(arr, m+1, r);
			merge(arr, l, m, r);
		}
		
	}
	
	public static void merge(int arr[], int l, int m, int r) {
		
		//size of both the sorted arrays
		int size1 = m-l+1;
		int size2 = r-m;
		
		int L[] = new int[size1];
		int R[] = new int[size2];
		
		
		//Copy the data to temp arrays
		for (int i=0; i<size1; ++i) {
			L[i] = arr[l+i];
		}
		for (int j=0;j<size2;++j) {
			R[j] = arr[m+1+j];
		}
		
		int i = 0,j = 0;
		int k = l;
		
		//Merge Logic
		while (i < size1 && j < size2) {
			if (L[i] <= R[j]) {
				arr [k] = L[i];
				i++;
			}
			else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}
			
			while(i < size1) {
				arr[k] = L[i];
				k++;
				i++;
			}
			
			while(j < size2) {
				arr[k] = R[j];
				j++;
				k++;
			}
	}
}
