package Abstraction;

public class Employee {
	String name;
	int id;
	double sal;
	public Employee(String name, int id, double sal) {
		super();
		this.name = name;
		this.id = id;
		this.sal = sal;
	}
	
	@Override
	public String toString() {
		
		return "emp[name "+name+ ",id"+ id +",sal"+sal +"]";
	}

	@Override
	public boolean equals(Object obj) {
		Student s1=(Student)obj;
		
		return this.id==s1.id;
	}
	

}
