package exception;
public class Nullpointer {
	public static void main(String[] args) {
		System.out.println("sandhya");
		try {
		C c1=null;
		System.out.println(c1.age);
		}
		catch(NullPointerException e) {
			System.out.println(e.getMessage());
			System.out.println("--------");
			e.printStackTrace();
		}
		System.out.println("sandy");
	}
}
		
	
