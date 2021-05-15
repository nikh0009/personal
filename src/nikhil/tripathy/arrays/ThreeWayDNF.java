package nikhil.tripathy.arrays;

import java.util.Arrays;

/* https://practice.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1
 * Dutch national flag problem,3 way 0,1,2.
 */

public class ThreeWayDNF {
	public static void main(String... args) {
		int arr[] = { 2, 1, 2, 1, 2, 2, 0, 0, 1, 2};
		dutchNationalFlag(arr);
		
		Arrays.stream(arr)
		      .forEach(System.out::print);
	}
	
	public static void dutchNationalFlag(int arr[]) {
		int lo = 0, mid = 0, hi = arr.length-1, swap = 0;
		while (mid <= hi) {
			switch(arr[mid]) {
			case 0:
				swap = arr[lo];
				arr[lo] = arr[mid];
				arr[mid] = swap;
				lo++;
				mid++;
				break;
			case 1:
				mid++;
				break;
			case 2:
				swap = arr[mid];
				arr[mid] = arr[hi];
				arr[hi] = swap;
				hi--;
				break;
			default: 
				System.out.println("Not possible");
			}
		}
	}
}
