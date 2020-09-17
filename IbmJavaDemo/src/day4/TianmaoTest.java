package day4;

public class TianmaoTest {
	public static void main(String[] args) {
		TianmaoStore t = new TianmaoStore();
		new Thread(new TianmaoProduct(t)).start();
		new Thread(new TianmaoProduct(t)).start();
		new Thread(new TianmaoProduct(t)).start();
		new Thread(new TianmaoConsume(t)).start();
		new Thread(new TianmaoConsume(t)).start();
		new Thread(new TianmaoConsume(t)).start();
		new Thread(new TianmaoConsume(t)).start();
	}

}
