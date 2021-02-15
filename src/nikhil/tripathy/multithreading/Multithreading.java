package nikhil.tripathy.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Multithreading {
	
	public static void main (String...strings) {
		ExecutorService es = Executors.newFixedThreadPool(100);
		
		for (int i=0; i<1000; i++) {
			es.submit(new Task(i));
		}
	}

}
