package day4;

public class Window extends Thread{
	//static int ticket=10; //先注释掉，然后放开和int ticket=10;比较
	//1.定义模拟总票数
	int ticket=10;
	//2.线程体执行内容
	public void run() {
		while(true) {
			if(ticket>0) {
				System.out.println(Thread.currentThread().getName()+"售票，票号为:"+ticket--);
			}else {
				break;
			}
		}
	}

}
