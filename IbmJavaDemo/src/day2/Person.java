package day2;

public class Person {
	private String name;
	private int age;
	public Person(){
		System.out.println("����1");
	}
	
	public Person(String name,int age) {
		System.out.println("����2");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
