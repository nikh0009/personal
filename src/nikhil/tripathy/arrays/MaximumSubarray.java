package nikhil.tripathy.arrays;

/*https://practice.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1
 * Kadane's algorithm implementation
 * */

public class MaximumSubarray {
	
	public static void main(String... args) {
		int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
		int maxSum = maxSubArray(arr);
		System.out.println(maxSum);
	}
	
	public static int maxSubArray(int arr[]) {
		int global = Integer.MIN_VALUE, local = 0;
		
		for (int i=0;i<arr.length;i++) {
			local = Math.max(arr[i], local+arr[i]);
			if (local > global)
				global = local;
		}
		return global;
	}
}
