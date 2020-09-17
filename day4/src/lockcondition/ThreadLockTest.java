package lockcondition;

public class ThreadLockTest {
	public static void main(String[] args) {
		Tianmao t = new Tianmao();
		new Thread(new ShengChanTrag(t)).start();
		new Thread(new ShengChanTrag(t)).start();
		new Thread(new ShengChanTrag(t)).start();
		new Thread(new XiaoFeiTrag(t)).start();
		new Thread(new XiaoFeiTrag(t)).start();
		new Thread(new XiaoFeiTrag(t)).start();
		new Thread(new XiaoFeiTrag(t)).start();
	}

}
