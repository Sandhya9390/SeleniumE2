package ArrayList;
import java.util.ArrayList;
public class demo1 {
	public static void main(String[] args) {
		ArrayList<Object>a1=new ArrayList<>();
		a1.add(100);
		a1.add("java");
		a1.add(null);
		a1.add("sql");
		ArrayList<Object>a2=new ArrayList<>();
		a2.add(100);
		a2.add("java");
		a2.add("abc");
		System.out.println(a1.remove(a2));
		System.out.println(a1);
		System.out.println(a2);
		a1.clear();
		a2.clear();
		System.out.println(a1);
		System.out.println(a2);
	
	
	}
}

		
	

