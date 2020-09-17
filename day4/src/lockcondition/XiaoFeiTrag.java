package lockcondition;

public class XiaoFeiTrag implements Runnable {

	private Tianmao t;

	public XiaoFeiTrag(Tianmao t) {
		super();
		this.t = t;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

		while (true) {
			t.xiaoFei();
		}
	}

}
