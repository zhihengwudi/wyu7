package day4;

public class SingletonThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t =Thread.currentThread();
		t.setName("窗口1");
		//全国就一个窗口在售票，共售票10张
		for(int i=0;i<10;i++){
		System.out.println(t.getName()+"售票，票号为:"+i);
		}
	}

}
