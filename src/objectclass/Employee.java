package objectclass;
public class Employee {
	
	String name;
	int id;
	double sal;
	int age;
	Address address;
	
	public Employee(String name, int id, double sal, int age, Address address) {
		super();
		this.name = name;
		this.id = id;
		this.sal = sal;
		this.age = age;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", sal=" + sal + ", age=" + age + ", address=" + address + "]";
	}
}
