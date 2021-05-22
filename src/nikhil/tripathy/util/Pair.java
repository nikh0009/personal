package nikhil.tripathy.util;

/*Learn generics properly and implement this to accept all other data types as well.
 * */
public class Pair {
	
	private int key;
	private int value;
	
	public Pair(int key, int value) {
		this.key = key;
		this.value = value;
	}
	
	public int first() {
		return key;
	}
	
	public int second() {
		return value;
	}
}
