package nikhil.tripathy.arrays;

import java.util.HashMap;
import java.util.Map;

//https://practice.geeksforgeeks.org/problems/count-pairs-with-given-sum5022/1
public class CountPairs {
	public static void main(String... args) {
		int arr[] = {1, 5, 7, 1};
		int k = 6;
		System.out.println(getPairsCount(arr, arr.length, k));
	}
	
	public static int getPairsCount(int arr[], int l, int k) {
		int count = 0;
		Map<Integer,Integer> countMap = new HashMap<Integer,Integer>();
		
		for (int i=0;i<l;i++) {
			int diff = k - arr[i];
			if (countMap.containsKey(diff))
				count ++;
			countMap.put(arr[i],i);
		}		
		return count;
	}
}
