package nikhil.tripathy.arrays;

/*https://practice.geeksforgeeks.org/problems/minimum-number-of-jumps-1587115620/1 
 * */

public class MinimumJumps {
	public static void main(String... args) {
		
		//int arr[] = {1,3,5,8,9,2,6,7,6,8,9};
		int arr[] = {2,3, 1, 1, 2, 4, 2, 0, 1, 1};
		int res = minJumps(arr);
		System.out.println(res);
	}

	
	//Wrong solution.. need to fix this
	public static int minJumps(int arr[]) {
		
		int jumps = 0, steps = 0, i = 0;
		
		while (i< arr.length-1) {
			steps = arr[i];
			if (!validMove(steps, arr.length))
				return -1;
			jumps++;
			i = i + steps;
		}
		return jumps;
	}
	

	public static boolean validMove(int ele, int len) {
		if (ele != 0 && ele < len)
			return true;
		return false;
	}
}
