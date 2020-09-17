package lockcondition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Tianmao {
	private volatile int value;// �������ֵ
	private final int MAX_VALUE = 10;
	private final int MIN_VALUE = 0;
	private Lock lock = new ReentrantLock();// ��������
	Condition c1 = lock.newCondition();
	Condition c2 = lock.newCondition();

	public void shengChan() {// ��������
		lock.lock();
		while (value >= MAX_VALUE) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " :ֹͣ��������ǰ��棺" + value);
			try {
				c1.await();// �����ߵȴ�
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		value++;
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " :������������棺" + value);
		c2.signalAll();// �����߻���
		lock.unlock();// �����߽���
	}

	// ģ�������ߺ�������ʾ������
	// �ֿ���
	public void xiaoFei() {// ���ѷ���
		lock.lock();// ��������
		while (value <= MIN_VALUE) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
			System.out.println(Thread.currentThread().getName() + " :ֹͣ���ѣ���ǰ��棺" + value);
			try {
				c2.await();// ���ѵȴ�
			} catch (InterruptedException e) {
			}
		}
		value--;
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
		}
		System.out.println(Thread.currentThread().getName() + " :�������ѣ���棺" + value);
		c1.signalAll();// ���ѻ���
		lock.unlock();// ���ѽ���
	}
}
