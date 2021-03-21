package nikhil.tripathy.arrays;


//https://www.geeksforgeeks.org/maximum-and-minimum-in-an-array/

public class MinMax {
	public static void main(String args[]) {
		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
		int arr[] = {2,34,5,6,7,8,9};
		
		for (int i=0;i<arr.length;i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
			else if (arr[i] > max)
				max = arr[i];
		}
		
		System.out.println(min + "   "+ max);
	}
}
