package methodoverriding;
public class student extends human{
	double fees;
	public student(String name,int id,int age,double fees) {
		super(name,id,age);
		this.fees=fees;
	}
	@Override
	public void details() {
		super.details();
		System.out.println(fees);
	}
}


