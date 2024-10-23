package methodoverriding;
public class employee extends human {
	double sal;
	public employee(String name,int id,int age,double sal) {
		super(name,id,age);
		this.sal=sal;
	}
	
@Override
public void details() {
	super.details();
	System.out.println(sal);
}
}

	

	









