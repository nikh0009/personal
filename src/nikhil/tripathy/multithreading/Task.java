package nikhil.tripathy.multithreading;

final class Task implements Runnable {
	
	private int id;
	
	public Task(int id) {
		this.id = id;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println("Info : "+ this.id + Thread.currentThread().getName());

	}

}
