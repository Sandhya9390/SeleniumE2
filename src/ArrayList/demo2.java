package ArrayList;
import java.util.ArrayList;
public class demo2 {
	public static void main(String[] args) {
		ArrayList<Object>a1=new ArrayList<>();
		a1.add(100);
		a1.add("java");
		a1.add("sql");
		a1.add(null);
		System.out.println(a1.contains("java"));
		System.out.println(a1.contains("sql"));
		ArrayList<Object>a2=new ArrayList<>();
		a2.add(100);
		a2.add("java");
		a2.add("sql");
		System.out.println(a1.containsAll(a2));
		System.out.println(a1.indexOf("sql"));
		
		
	}
}
	
	
	
	
	


