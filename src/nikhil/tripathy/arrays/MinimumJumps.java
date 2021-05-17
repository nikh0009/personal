package nikhil.tripathy.arrays;

/*https://practice.geeksforgeeks.org/problems/minimum-number-of-jumps-1587115620/1 
 * */

public class MinimumJumps {
	public static void main(String... args) {
		
		int arr[] = {1,3,5,8,9,2,6,7,6,8,9};
		int res = minJumps(arr);
		System.out.println(res);
	}
	
	public static int minJumps(int arr[]) {
		
		int jumps = 0, steps = 0, i = 0;
		
		while (i< arr.length) {
			steps = arr[i];
			if (!validMove(arr[i], arr.length))
				return -1;
			jump
		}
		return res;
	}
	public static boolean validMove(int ele, int len) {
		if (ele != 0 && ele < len)
			return true;
		return false;
	}
}
