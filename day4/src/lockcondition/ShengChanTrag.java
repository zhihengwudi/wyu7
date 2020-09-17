package lockcondition;

public class ShengChanTrag implements Runnable {

	private Tianmao t;

	public ShengChanTrag(Tianmao t) {
		super();
		this.t = t;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			t.shengChan();
		}
	}

}
