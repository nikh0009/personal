package nikhil.tripathy.asyn;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

//Tutorial based sample program for Completeable Future 1.8

public class AsyncProgramingBegin {
	public static void main(String...strings) throws Exception {
		
		System.out.println("From main class, before calling computeSomething");
		Future<String> future = computeSomething();
		System.out.println("call to computesomething is made");
		System.out.println(future.get());
		System.out.println("Above call is blocking");
	}
	
	public static Future<String> computeSomething () {
		CompletableFuture<String> completableFuture = new CompletableFuture();
		
		Executors.newCachedThreadPool().submit(() -> {
			Thread.sleep(5000);
			completableFuture.complete("I'm done executing");
			return null;
		});
		return completableFuture;
	}
}
