package baekJoon.Q_1000_1999;

import java.util.Timer;
import java.util.TimerTask;

public class OneTimeSchedulerExample {

	public static void main(String[] args) {
		String timer_name = "test";
		Timer timer = new Timer(timer_name, true);
		TimerTask task = new TimerTask() {
			@Override
			public void run() {
				if(Thread.currentThread().getName().equals(timer_name)){
					System.out.println("Execution time is :" + System.currentTimeMillis() + " Name of the thread is :"
							+ Thread.currentThread().getName());
					return;
				} else {
					return;
				}
			}
		};
		testSchdule(timer, task, 1000L);

	}
	public static int testSchdule(Timer timer, TimerTask task, Long how) {
		if (true) {
			timer.schedule(task, how);
			
			return 0;
		} else {
			return 1;
		}
	}
	

}