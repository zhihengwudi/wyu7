package day4;

public class Window extends Thread{
	//static int ticket=10; //��ע�͵���Ȼ��ſ���int ticket=10;�Ƚ�
	//1.����ģ����Ʊ��
	int ticket=10;
	//2.�߳���ִ������
	public void run() {
		while(true) {
			if(ticket>0) {
				System.out.println(Thread.currentThread().getName()+"��Ʊ��Ʊ��Ϊ:"+ticket--);
			}else {
				break;
			}
		}
	}

}
