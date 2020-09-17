package sleepjoinyield;

public class JoinTest {
	public static void main(String[] args) {
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("����һ�����ֵ�С�߳�2");
			}
		});
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("����һ�����˵�С�߳�1");
			}
		});
		// ����join()��Ϊ��
		Thread t3 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("����һ����ŭ��С�߳�3");
			}
		});
		t1.start();
		try {
			t1.join();// �õ�ǰ�߳�ִ������ִ��������
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// ����join()��Ϊ��
		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t3.start();
	}

}
