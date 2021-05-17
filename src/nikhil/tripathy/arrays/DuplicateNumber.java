package nikhil.tripathy.arrays;

import java.util.HashSet;
import java.util.Set;

public class DuplicateNumber {
	public static void main(String...args) {
		int arr[] = {1,3,4,2,2};
		System.out.println(findDuplicate(arr));
	}
	
//	public static int findDuplicate(int[] nums) {
//		Set<Integer> set = new HashSet<Integer>();
//		for (int i=0;i<nums.length;i++) {
//			if (!set.add(nums[i]))
//				return nums[i];
//		}
//		return -1;
//	}
	
	
	//Floyd's algorithm for cycle detection
	public static int findDuplicate(int[] nums) {
		int tor = nums[0];
		int hare = nums[0];
		
		do {
			tor = nums[tor];
			hare = nums[nums[hare]];
		}while (tor != hare);
		
		tor = nums[0];
		while(tor != hare) {
			tor = nums[tor];
			hare = nums[hare];
		}
		
		return hare;
	}
}
