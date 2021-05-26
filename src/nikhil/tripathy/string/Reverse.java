package nikhil.tripathy.string;

class Reverse {
	
	public static void main(String... args) {
		char[] s = {'h','e','l','l','o'};
		System.out.println("Before reverse");
		printCharArray(s);
		reverseString(s);
		System.out.println("After reverse");
		printCharArray(s);
	}
 	
    public static void reverseString(char[] s) {
        int start = 0; 
        int end = s.length-1;
        char temp;
        while (start <= end) {
            temp = s[end];
            s[end] = s[start];
            s[start] = temp;
            start++;
            end--;
        }
    }
    public static void printCharArray(char[] arr) {
		for (char ch : arr) {
			System.out.print(ch);
		}
		System.out.println();
    }
}