package nikhil.tripathy.stacks;

import java.util.ArrayList;
import java.util.Stack;

import nikhil.tripathy.util.Pair;

public class MaximumHistorgramArea {
	
	public static void main(String... args) {
		
		int arr[] = {6, 2, 5, 4, 5, 1, 6};
		int res = maxArea(arr);
		System.out.println(res);
	}
	
	public static int maxArea(int arr[]) {
		int res = Integer.MIN_VALUE;
		int temp = 0;
		int right[] = smallestRight(arr);
		int left[] = smallestLeft(arr);
		for(int i=0;i<arr.length;i++) {
			temp = arr[i] * (right[i]-left[i]-1);
			if (temp > res)
				res = temp;
		}
		return res;
	}
	
	public static int[] smallestRight(int arr[]) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Stack<Pair> stack = new Stack<Pair>();
		int len = arr.length;
		int res[] = new int[arr.length];
		
		for (int i=arr.length-1;i>=0;i--) {
			if (stack.size() == 0)
				list.add(-1);
			else if(i == 0)
				list.add(-1);
			else if(stack.peek().second() < arr[i]) {
				list.add(stack.peek().first());
			}
			else if(stack.peek().second() > arr[i]) {
				while(stack.size() != 0 && stack.peek().second() > arr[i]) {
					stack.pop();
				}
				if (stack.size() == 0)
					list.add(-1);
				else if(stack.peek().second() < arr[i])
					list.add(stack.peek().first());
			}
			stack.push(new Pair(i, arr[i]));
		}
		for (int i=0;i<list.size();i++) {
			res[len-1-i] = list.get(i);
		}
		return res;
	}
	
	public static int[] smallestLeft(int arr[]) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Stack<Pair> stack = new Stack<Pair>();
		int res[] = new int[arr.length];
		
		for (int i=0;i<arr.length-1;i++) {
			if (stack.size() == 0)
				list.add(arr.length);
			else if(i == 0)
				list.add(-1);
			else if(stack.peek().second() < arr[i]) {
				list.add(stack.peek().first());
			}
			else if(stack.peek().second() > arr[i]) {
				while(stack.size() != 0 && stack.peek().second() > arr[i]) {
					stack.pop();
				}
				if (stack.size() == 0)
					list.add(arr.length);
				else if (stack.peek().second() < arr[i])
					list.add(stack.peek().first());
			}
			stack.push(new Pair(i, arr[i]));
		}
		for (int i=0;i<list.size();i++) {
			res[i] = list.get(i);
		}
		return res;
	}
}
