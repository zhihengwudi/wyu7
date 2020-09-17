package day4;

public class MultiThread {
	public static void main(String[] args) {
		// 3.创建2个线程对象
		Window w1 = new Window();
		Window w2 = new Window();
		// 设置线程名
		w1.setName("窗口1");
		w2.setName("窗口2");
		// 4.开启2个子线程
		w1.start();
		w2.start();
	}

}
