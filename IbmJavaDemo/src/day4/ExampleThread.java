package day4;

public class ExampleThread {

	public static void main(String[] args){
		TicketWindow t1=new TicketWindow();
		TicketWindow t2=new TicketWindow();
		TicketWindow t3=new TicketWindow();
		TicketWindow t4=new TicketWindow();
		// t1.setName("�߳�1");
		// t2.setName("�߳�2");
		// t3.setName("�߳�3");
		// t4.setName("�߳�4");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		}

}
