package nikhil.tripathy.asyn;

import java.util.HashSet;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;

//Tutorial based sample program for Completeable Future 1.8

public class AsyncProgramingBegin {
	public static void main(String...strings) throws Exception {
		
		
		System.out.println("From main class, before calling computeSomething");
		CompletableFuture<String> future = computeSomething();
		System.out.println("call to computesomething is made");
//		System.out.println(future.get()); //This is a blocking call
		
		//It's unblocking
		future.thenAccept((something) ->{
			System.out.println(something);
			System.out.println("Done");
		});
		System.out.println("Above call is blocking");
	}
	
	public static CompletableFuture<String> computeSomething () {
		CompletableFuture<String> completableFuture = new CompletableFuture<>();
		
		Executors.newCachedThreadPool().submit(() -> {
			Thread.sleep(5000);
			completableFuture.complete("I'm done executing");
			return null;
		});
		return completableFuture;
	}
}
