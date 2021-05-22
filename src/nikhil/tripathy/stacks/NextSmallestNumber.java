package nikhil.tripathy.stacks;

import java.util.ArrayList;
import java.util.Stack;

import nikhil.tripathy.util.Printer;

//Variation of NextGreatesNumber, foundation classes for understanding more complex problems.

public class NextSmallestNumber {
	public static void main(String...args) {
		int arr[] = {1,3,2,4};
		ArrayList<Integer> list = nextSmallest(arr);
		list.stream()
		     .forEach(Printer::print);
	}
	
	public static ArrayList<Integer> nextSmallest(int arr[]) {
		ArrayList<Integer> res = new ArrayList<Integer>();
		Stack<Integer> stack = new Stack<Integer>();
		//This is for finding the smallest element towards the right
		for(int i=arr.length-1;i>=0;i--) {
			if (stack.size() == 0) {
				res.add(-1);
			}
			else if (arr[i] > stack.peek()) {
				res.add(stack.peek());
			}
			else if(arr[i] < stack.peek()) {
				while(stack.size() != 0 && arr[i] < stack.peek()) {
					stack.pop();
				}
				if (stack.size() == 0)
					res.add(-1);
				else 
					res.add(stack.peek());
			}
			stack.push(arr[i]);
		}
		return res;
	}
}
