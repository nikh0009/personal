package nikhil.tripathy.arrays;

//https://www.geeksforgeeks.org/write-a-program-to-reverse-an-array-or-string/

public class ReverseArray {
	public static void main(String args[]) {
		int arr[] = {1,2,3,4,5,6};
		int aux = 0;
		
		int start = 0, end = arr.length-1;
		//two pointer logic does this is same space
		//similar logic can be used in string reverse also
		while (start < end) {
			aux = arr[start];
			arr[start] = arr[end];
			arr[end] = aux;
			start++;
			end--;
		}
		for (int i : arr) {
			System.out.print(i);
		}
	}
	
	/*
	 * recursive way of doing it
	void reverseArrayRecc(int arr[], int start, int end) {
		if (start >= end)
			return;
		int aux = arr[start];
		arr[start] = arr[end];
		arr[end] = aux;
		start++;
		end--;
		reverseArrayRecc(arr, start, end);
	}
	*/
}
