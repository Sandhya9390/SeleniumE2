package ArrayList;

import java.util.ArrayList;
public class manager<emp> {
	String name;
	int mgr_id;
	double sal;
	char gender;
	ArrayList<Emp>emp=new ArrayList<>();
	public manager(String name, int mgr_id, double sal, char gender) {
		super();
		this.name = name;
		this.mgr_id = mgr_id;
		this.sal = sal;
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "manager [name=" + name + ", mgr_id=" + mgr_id + ", sal=" + sal + ", gender=" + gender + ", emp=" + emp
				+ "]";
	}
	public  void addEmp(Emp e1) {
	
		
		emp.add(e1);
		System.out.println("Emp added");
		
		
	}

}
	
	
	

	


