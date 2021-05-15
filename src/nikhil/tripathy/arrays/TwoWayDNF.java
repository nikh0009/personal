package nikhil.tripathy.arrays;
/*Dutch national flag problem, 2 way*/

public class TwoWayDNF {
	
	public static void main (String... args) {
		int arr[] = { 1, 0, 1, 0, 1, 1, 1, 0, 0, 1};
		
		twoWayPartition(arr);
		
		for (int i : arr) {
			System.out.print(i+ " ");
		}
	}
	
	public static void twoWayPartition(int arr[]) {
		int lo = 0, hi = arr.length-1;
		int swap = 0;
		while (lo <= hi) {
			if (arr[lo] == 0) 
				lo++;
			else {
				swap = arr[lo];
				arr[lo] = arr[hi];
				arr[hi] = swap;
				hi--;
			}
		}
	}
}
