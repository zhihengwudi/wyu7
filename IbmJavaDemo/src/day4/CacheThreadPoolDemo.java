package day4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CacheThreadPoolDemo {
	public static void main(String args[]) {
		ExecutorService pool = Executors.newCachedThreadPool();
		for (int i = 0; i <= 10; i++) {
			pool.execute(() -> {
				System.out.println(Thread.currentThread().getName() + "[runing done]");
			});
		}
	}

}
