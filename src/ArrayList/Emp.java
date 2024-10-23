package ArrayList;
public class Emp {
	String name;
	int emp_id;
	double sal;
	String project;
	String role;
	public Emp(String name, int emp_id, double sal, String project, String role) {
		super();
		this.name = name;
		this.emp_id = emp_id;
		this.sal = sal;
		this.project = project;
		this.role = role;
	}
	@Override
	public String toString() {
		return "employee [name=" + name + ", emp_id=" + emp_id + ", sal=" + sal + ", project=" + project + ", role="
				+ role + "]";
	}
}
	



