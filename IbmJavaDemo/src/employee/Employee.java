package employee;

import address.Address;

public class Employee {
	private int id; 
	private int age;
	private String name;
	private String gender;
	private Address address;
	
	public Employee(int id,int age,String name,
			String gender,Address address) {
		this.id=id;
		this.age=age;
		this.address=address;
		this.name=name;
		this.gender=gender;
	}
	
	void show(Employee emp) {
		System.out.println(emp);
	}
	
	@Override
	public String toString() {
		return "id=" + id + ", age=" + age + ", name=" + name + ", gender=" + gender + address;
	}

	public static void main(String[] args) {
		Employee emp = new Employee(112233,24,"张三","男",
				new Address("江门","迎宾大道99号"));
		emp.show(emp);
	}
}
