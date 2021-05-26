package nikhil.tripathy.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Count the characters in string using hashing technique

public class CharacterCount {
	
	static final int NO_OF_CHARS = 256;
	static final int[] arr = new int[NO_OF_CHARS];
	
	public static void main(String...args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String input = br.readLine();
		fillArray(input);
		for (int i=0;i<NO_OF_CHARS;i++) {
			if (arr[i] > 1) {
				System.out.println((char)i + " " + arr[i]);
			}
		}
		
	}
	
	public static void fillArray(String input) {
		for (int i=0;i<input.length();i++) {
			arr[input.charAt(i)]++;
		}
	}
}
