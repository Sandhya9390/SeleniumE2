package exception;
public class classcast {
	public static void main(String[] args) {
		System.out.println("sandhya");
		A a1=new A();
		try {
		B b1=(B)a1;
		}
		catch(ClassCastException e) {
			System.out.println("exception handled");
		}
	System.out.println("sandy");
	}
}
