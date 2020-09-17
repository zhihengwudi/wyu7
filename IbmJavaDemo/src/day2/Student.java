package day2;

public class Student {
	private String name;
	private int age;
	private String garde;
	
	public Student(String name,int age,String garde) {
		this.age=age;
		this.name=name;
		this.garde=garde;
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Student s1=new Student("¥Û…µ",23,"17080x");
		Student s2=(Student)s1.clone();
	}
}
