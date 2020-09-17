package day1;

public class Student {
	private int id;
	private String name;
	private int age;
	private String gender;
	
	public Student(int id,String name,int age,String gender) {
		this.id=id;
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
	
	public void study() {
		System.out.println(this.name+"��ѧϰʱ��˯����");
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}

	public static void main(String args[]) {
		Student student=new Student(001,"������",22,"��");
		System.out.println(student);
		student.study();
	}
	
	
}
