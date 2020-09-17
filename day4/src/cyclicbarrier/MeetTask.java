package cyclicbarrier;

import java.util.concurrent.BrokenBarrierException;

public class MeetTask implements Runnable {
	private Meet meet;

	public MeetTask(Meet meet) {
		super();
		this.meet = meet;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			meet.doMeet();
		} catch (BrokenBarrierException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}// ���ÿ����෽��
	}

}
