package semaphore;

public class WcTest {

	public static void main(String[] args) {
		Wc wc = new Wc();
		for (int i = 0; i < 50; i++) {
			new Thread(new WcTask(wc)).start();
		}
	}
}
