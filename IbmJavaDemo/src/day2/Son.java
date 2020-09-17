package day2;

public class Son extends Person{
	private String gender;
	
	public Son() {
		//super();
		System.out.println("子类1");
	}
	
	public Son(String gender) {
		//super();
		System.out.println("子类2");
	}
	
	//重载
	public int add(int a,int b) {
		return a+b;
	}
	
	public int add(int a,int b,int c) {
		return a+b+c;
	}
	
	public void Read() {
		super.getClass();
	}
	public static void main(String[] args) {
		Son son=new Son("男");
		System.out.println(son);
		System.out.println(son.add(1, 2));
		System.out.println(son.add(1, 2, 3));
	}
	
	
}
