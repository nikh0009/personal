package nikhil.tripathy.personal;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ExternalizableTest {
	
	public static void main (String...strings) {
		
		Country c = new Country(45, "Someplace");
		 //could have used setters here, for above
		
		
		try {
			FileOutputStream f1 = new FileOutputStream("C:\\Nikhil Tripathy\\serial.ser");
			ObjectOutputStream o1 = new ObjectOutputStream(f1);
			
			c.writeExternal(o1);
			o1.flush();
			o1.close();
			f1.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			System.out.println(e.getLocalizedMessage());
		}
		
		try {
			Country c2 = new Country();
			FileInputStream f2 = new FileInputStream("C:\\Nikhil Tripathy\\serial.ser");
			ObjectInputStream o2 = new ObjectInputStream(f2);
			c2.readExternal(o2);
			
			System.out.println();
		}
		catch (FileNotFoundException e) {
			System.out.println(e.getLocalizedMessage());
			System.out.println();
		}
		catch (ClassNotFoundException e) {
			System.out.println(e.getLocalizedMessage());
		}
		catch (IOException e) {
			System.out.println(e.getLocalizedMessage());
		}
 		
	}

}
