package MultiThreading;

public class demo {
	public static void main(String[] args) {
		Thread t1=new Thread();
		System.out.println(t1.getId());
		System.out.println(t1.getName());
		t1.setName("sandhya");
		System.out.println(t1.getName());
		Thread t2=new Thread();
		System.out.println(t2.getId());
		System.out.println(t2.getName());
		
		
	}

}
