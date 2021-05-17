package nikhil.tripathy.arrays;

//https://www.geeksforgeeks.org/move-negative-numbers-beginning-positive-end-constant-extra-space/

import java.util.Arrays;

public class NegativePositve {

	public static void main(String[] args) {
		int arr[] = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
		negativePositive(arr);
		Arrays.stream(arr).forEach(System.out::println);
	}
	public static void negativePositive(int arr[]) {
		int lo = 0, hi = arr.length-1, swap = 0;
		while (lo <=hi) {
			if (arr[lo] >= 0) {
				swap = arr[lo];
				arr[lo] = arr[hi];
				arr[hi] = swap;
				hi--;
			}
			lo++;
		}
	}
}
