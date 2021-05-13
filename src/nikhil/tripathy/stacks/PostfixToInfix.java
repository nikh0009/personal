package nikhil.tripathy.stacks;

import java.util.Stack;

/*
 * This needs improvement, to many parenthesis.
 * */

public class PostfixToInfix {
	public static void main(String...strings ) {
		Stack<String> st = new Stack<String>();
		String input = "ab*c+";
		for (int i=0;i<input.length();i++) {
			char ch = input.charAt(i);
			if (Character.isLetter(ch)) {
				st.push(Character.toString(ch));
			}
			else {
				String t ="",u="";
				t = st.pop();
				u = st.pop();
				st.push("(" + u + Character.toString(ch) + t + ")");
			}
		}
		System.out.println(st.pop());
	}
}
