package day4;

public class SingletonThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t =Thread.currentThread();
		t.setName("����1");
		//ȫ����һ����������Ʊ������Ʊ10��
		for(int i=0;i<10;i++){
		System.out.println(t.getName()+"��Ʊ��Ʊ��Ϊ:"+i);
		}
	}

}
