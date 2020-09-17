package day4;

public class ConcurrencyTest {
	private static final long count = 100000;// ����count = 100000000�Ƚ�Ч��

	public static void main(String[] args) throws InterruptedException {
		System.out.println("��ǰ��������Ϊ��" + count);
		// ����ִ��
		concurrency();
		// ����ִ��
		serial();
	}

	// ����ִ�У�a���ۼӲ���������һ���߳�ִ�У�b�ĵݼ�������Ȼ������ ����ִ��
	private static void concurrency() throws InterruptedException {
		long start = System.currentTimeMillis();
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				long a = 0;
				for (int i = 0; i < count; i++)
					a += 5;
			}
		});
		thread.start();
		long b = 0;
		for (int j = 0; j < count; j++)
			b--;
		// ����a���ۼӵ�������������߳�ִ��
		thread.join();// �����ǵ����̵߳ȴ����߳���ɺ󣬲��ܼ�����������
		long time = System.currentTimeMillis() - start;
		System.out.println("����ִ�к�ʱ:" + time + "ms");
	}

	private static void serial() {
		long start = System.currentTimeMillis();
		long a = 0;
		for (int i = 0; i < count; i++) {
			a += 5;
		}
		long b = 0;
		for (int i = 0; i < count; i++) {
			b--;
		}
		long spend = System.currentTimeMillis() - start;
		System.out.println("���к�ʱ:" + spend + "ms");
	}

}
