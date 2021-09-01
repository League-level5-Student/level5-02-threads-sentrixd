package _03_Threaded_Greeting;

public class ThreadGreeter implements Runnable {
	private int threadNumber;
	
	public ThreadGreeter(int num) {
		this.threadNumber = num;
	}
	
	@Override
	public void run() {
		System.out.println("Thread: " + this.threadNumber);
		
		if (threadNumber < 50) {
			Thread t = new Thread(new ThreadGreeter(threadNumber+1));
			
			t.start();
		}
	}

}
