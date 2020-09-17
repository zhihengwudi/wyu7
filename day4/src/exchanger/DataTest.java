package exchanger;

import java.util.concurrent.Exchanger;

//模拟两台数据挖掘机器，挖掘之后将两个线程的挖掘的数据交换
public class DataTest {
	public static void main(String[] args) {
		Exchanger<String> exchanger = new Exchanger<>();
		Data shuju = new Data(exchanger);
		new Thread(new DataTaskA(shuju)).start();
		new Thread(new DataTaskB(shuju)).start();
	}
}
