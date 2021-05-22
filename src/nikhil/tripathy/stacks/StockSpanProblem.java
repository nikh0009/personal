package nikhil.tripathy.stacks;

import java.util.ArrayList;
import java.util.Stack;

import nikhil.tripathy.util.Pair;

//https://www.geeksforgeeks.org/the-stock-span-problem/

public class StockSpanProblem {
	public static void main(String... args) {
		int arr[] = {100, 80, 60, 70, 65, 75, 85};
		ArrayList<Integer> list = stockSpan(arr);
		list.stream()
		    .forEach(System.out::print);
	}
	
	public static ArrayList<Integer> stockSpan(int arr[]) {
		ArrayList<Integer> res = new ArrayList<Integer>();
		Stack<Pair> stack = new Stack<Pair>();
		for(int i=0;i<arr.length;i++) {
			if (stack.size() == 0)
				res.add(-1);
			else if (stack.peek().second() > arr[i]) {
				res.add(i - stack.peek().first());
			}
			else if (stack.peek().second() < arr[i]) {
				while (stack.size() != 0 && stack.peek().second() < arr[i])
					stack.pop();
				if (stack.size() == 0)
					res.add(-1);
				else 
					res.add(i - stack.peek().first());
			}
			stack.push(new Pair(i, arr[i]));
		}
		return res;
	}
}
