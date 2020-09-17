package day4;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutorCreatePool {
	public static void main(String args[]) {
		ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 10, 10L, TimeUnit.SECONDS,
				new LinkedBlockingDeque<>(1000), new ThreadPoolExecutor.AbortPolicy());
		final CountDownLatch countDownLatch = new CountDownLatch(8);

		for (int i = 0; i < 8; i++) {
			final int currentIndex = i;
			System.out.println("提交第" + i + "个线程");
			threadPoolExecutor.execute(() -> {
				System.out.println(Thread.currentThread().getName() + ", currentIndex is : " + currentIndex);
				countDownLatch.countDown();
			});
		}
		System.out.println("全部提交完毕");
		try {
			System.out.println("准备等待线程池任务执行完毕");
			countDownLatch.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("全部线程执行完毕");
	}

}
