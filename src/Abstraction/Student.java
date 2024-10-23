package Abstraction;

public class Student {
	String name;
	int id;
	double fees;
	public Student(String name, int id, double fees) {
		super();
		this.name = name;
		this.id = id;
		this.fees = fees;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", fees=" + fees + "]";
	}

	@Override
	public boolean equals(Object obj) {
		Employee e1=(Employee)obj;
		
		return this.id==e1.id;
	}
	

}
