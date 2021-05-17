package nikhil.tripathy.arrays;

import java.util.Arrays;

//https://practice.geeksforgeeks.org/problems/merge-two-sorted-arrays5135/1

public class MergeInplace {
	public static void main(String... args) {
		
		int arr1[] = {1, 3, 5, 7};
		int arr2[] = {0, 2, 6, 8, 9};
		
		mergeInplace(arr1, arr2);
		Arrays.stream(arr1)
		.forEach(System.out::print);
		Arrays.stream(arr2)
		.forEach(System.out::print);
		
	}
	
	public static void mergeInplace(int arr1[], int arr2[]) {
		
		for (int i=0;i<arr1.length;i++) {
			if (arr1[i] > arr2[0]) {
				int temp = arr1[i];
				arr1[i] = arr2[0];
				arr2[0] = temp;
				Arrays.sort(arr2);
			}
		}
	}
}
