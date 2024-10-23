package objectclass;
public class Execution {
	public static void main(String[] args) {
		Employee emp1=new Employee("abc",21,30000.0,30,new Address("India","tel","hyd",505530));
		System.out.println(emp1.address.state);
		System.out.println(emp1);
		System.out.println(emp1.age);
	}

}
