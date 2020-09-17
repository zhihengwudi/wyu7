package day4;

public class TianmaoConsume implements Runnable {
	private TianmaoStore t;

	public TianmaoConsume(TianmaoStore t) {
		super();
		this.t = t;
	}

	@Override
	public void run() {
		while (true) {
			t.xiaoFei();
		}
	}
}
