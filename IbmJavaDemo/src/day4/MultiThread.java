package day4;

public class MultiThread {
	public static void main(String[] args) {
		// 3.����2���̶߳���
		Window w1 = new Window();
		Window w2 = new Window();
		// �����߳���
		w1.setName("����1");
		w2.setName("����2");
		// 4.����2�����߳�
		w1.start();
		w2.start();
	}

}
