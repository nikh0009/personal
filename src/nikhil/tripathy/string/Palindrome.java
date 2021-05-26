package nikhil.tripathy.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome {

	public static void main(String... args) {
		String input = "";
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try {
			input = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Some fucking exception occured");
			e.printStackTrace();
		}
		boolean res = checkPalindrome(input);
		if (res) {
			System.out.println(input + " is palindrome");
		} else {
			System.out.println(input+" is not Palindrome");
		}
	}
	
	public static boolean checkPalindrome(String input) {
		input = input.toLowerCase();
		char[] arr = input.toCharArray();
		int start = 0, end = arr.length-1;
		while (start <= end) {
			char temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		String rev = String.valueOf(arr);
		return rev.equals(input);
	}
}
