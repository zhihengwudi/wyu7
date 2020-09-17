package day1;

public class Teacher {
	private int id;
	private String name;
	private int age;
	private String gender;
	
	public Teacher(int id,String name,int age,String gender) {
		this.id=id;
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
	
	public static void main(String args[]) {
		Teacher teacher=new Teacher(001,"³ÂxiaoÈå",22,"ÄĞ");
	}
}
