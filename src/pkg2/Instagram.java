package pkg2;

public class Instagram {
	String un;
	long pass;
	long mobno;
	int age;
	char gender;
	public Instagram(String un, long pass) {
		super();
		this.un = un;
		this.pass = pass;
	}
	
	public Instagram(String un, long pass, long mobno, int age, char gender) {
		this(un,pass,mobno,age);
		this.gender=gender;
	}
	public Instagram(String un, long pass, long mobno, int age) {
		this(un,pass);
		this.mobno=mobno;
		this.age=age;
	}

public void details()
{
	System.out.println(un);
	System.out.println(pass);
	System.out.println(mobno);
	System.out.println(age);
	System.out.println(gender);
}
}

	

	
	
	
		
				
		
		
	
		
	
	

