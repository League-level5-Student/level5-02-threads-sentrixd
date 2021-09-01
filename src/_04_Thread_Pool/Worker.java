package _04_Thread_Pool;

import java.util.concurrent.ConcurrentLinkedQueue;

public class Worker implements Runnable {
	ConcurrentLinkedQueue<Task> taskQueue;
	
	public Worker(ConcurrentLinkedQueue<Task> t) {
		this.taskQueue = t;
	}

	@Override
	public void run() {
		while (!taskQueue.isEmpty()) {
			taskQueue.poll().preform();
		}
	}

}
