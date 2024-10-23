package methodoverriding;
public class execution {
	public static void main(String[] args) {
		human h1=new human("abc",30,25);
		h1.details();
		employee e1=new employee("xyz",20,30,20000.0);
		e1.details();
		student s1=new student("pqr",30,35,40000.0);
		s1.details();
	}
}



