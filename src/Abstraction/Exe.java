package Abstraction;

public class Exe {
	public static void main(String[] args) {
		Student s1=new Student("abc", 23, 20000.0);
		Student s2=new Student("abc", 23, 20000.0);
		Employee e1=new Employee("abc", 23, 20000.0);
		System.out.println(s1.equals(e1));
		System.out.println(s1.equals(s2));
	}

}
