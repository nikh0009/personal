package nikhil.tripathy.stacks;

import java.util.Stack;

public class Postfix {
	public static void main(String[] args) {
		String eval = "123+*8-";
		Stack<Integer> st = new Stack<Integer>();
		int len = eval.length();
		
		for (int i=0;i<len;i++) {
			char ch = eval.charAt(i);
			if (Character.isDigit(ch)) {
				st.push(ch - '0');
			}
			else {
				int t=0, x=0, res = 0;
				t = st.pop();
				x = st.pop();
				switch(ch) {
				case '*':
					res = t*x;
					break;
				case '+':
					res = t + x;
					break;
				case '-':
					res = x - t;
					break;
				case '/':
					res = x / t;
					break;
				default :
					System.out.println("Not valid");
					break;
				}
				st.push(res);
			}
		}
		System.out.println(st.peek());
	}
}
