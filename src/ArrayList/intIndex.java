package ArrayList;
import java.util.ArrayList;
public class intIndex {
	public static void main(String[] args) {
		ArrayList<Integer>a1=new ArrayList<>();
		a1.add(34);
		a1.add(null);
		a1.add(0,100);
		ArrayList<Integer>a2=new ArrayList<>();
		a2.add(200);
		a2.addAll(0,a1);
		System.out.println(a1);
		System.out.println(a2);
	}
}
		
		
		

	


