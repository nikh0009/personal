package nikhil.tripathy.personal;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class ByteArray {
	public static void main(String... args) throws Exception {
		String name = "name is nothing!";
		byte[] bts = name.getBytes("UTF-8");
		InputStream is = new ByteArrayInputStream(bts);
		int data = is.read();
		
		while (data != -1) {
			System.out.print((char)data);
			data = is.read();
		}
	}
}
