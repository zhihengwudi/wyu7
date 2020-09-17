package day4;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPoolExecutorDemo {
	public static void main(String args[]) {
		ScheduledExecutorService pool = Executors.newScheduledThreadPool(10);
		for (int i = 0; i <= 10; i++) {
			pool.schedule(() -> {
				System.out.println(Thread.currentThread().getName() + "[runing done]");
			}, 10, TimeUnit.SECONDS);
		}
	}
}
