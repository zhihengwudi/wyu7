package sleepjoinyield;

public class JoinTest {
	public static void main(String[] args) {
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("我是一个快乐的小线程2");
			}
		});
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("我是一个悲伤的小线程1");
			}
		});
		// 测试join()类为例
		Thread t3 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("我是一个愤怒的小线程3");
			}
		});
		t1.start();
		try {
			t1.join();// 让当前线程执行完再执行其他的
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// 测试join()类为例
		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t3.start();
	}

}
