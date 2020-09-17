package countdownlatch;

import java.util.concurrent.CountDownLatch;

public class Eat {

	private CountDownLatch countDownLatch;

	public Eat(CountDownLatch countDownLatch) {
		super();
		this.countDownLatch = countDownLatch;
	}

	public void doEat() {
		System.out.println(Thread.currentThread().getName() + " :正在吃饭");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		countDownLatch.countDown();// 如果计数到达零，则释放所有等待的线程
	}
}
