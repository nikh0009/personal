package nikhil.tripathy.greedy;

import java.util.PriorityQueue;

public class OptimalMergePattern {
	public static void main(String...args) {
		
		int arr[] = {20,30,30,10,5};
		int res = optimalMerge(arr);
		System.out.println(res);
	}
	
	public static int optimalMerge(int arr[]) {
		int res = 0;
		int temp=0;
		
		//priorityqueue is the trick here.
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		for (int i=0;i<arr.length;i++) {
			pq.add(arr[i]);
		}
		
		while(pq.size() > 1) {
			temp = pq.poll() + pq.poll();
			res += temp;
			pq.add(temp);
		}
		return res;
	}
}
