package methodoverriding;
public class human {
	String name;
	int id;
	int age;
	public human(String name,int id,int age) {
		super();
		this.name=name;
		this.id=id;
		this.age=age;
	}
	public void details() {
		System.out.println(name);
		System.out.println(id);
		System.out.println(age);
	}
}



