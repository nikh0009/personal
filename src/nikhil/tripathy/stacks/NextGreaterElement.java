package nikhil.tripathy.stacks;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import nikhil.tripathy.util.Printer;

/*This is learnt as part of stack learning, new way of stack application*
 */

public class NextGreaterElement {
	
	public static void main(String...args) {
		int arr[] = {4, 5, 2, 25};
		List<Integer> list = nextGreater(arr);
		//Read this in reverse
		list.stream()
		  .forEach(Printer::print);
	}
	
	public static ArrayList<Integer> nextGreater(int arr[]) {
		ArrayList<Integer> res = new ArrayList<Integer>();
		Stack<Integer> st = new Stack<Integer>();
		//for (int i=0;i<arr.length;i++) { This is the change for next greatest element on the left
		for (int i=arr.length-1;i>=0;i--) {
			if (st.size() == 0)
				res.add(-1);
			else if (arr[i] < st.peek())
				res.add(st.peek());
			else if (arr[i] > st.peek()) {
				while(st.size() != 0 && st.peek() < arr[i]) {
					st.pop();
				}
					if (st.size() == 0)
						res.add(-1);
					else 
						res.add(st.peek());
			}
			st.push(arr[i]);
		}
		return res;
	}
}
