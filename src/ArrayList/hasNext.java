package ArrayList;
import java.util.ArrayList;
import java.util.Iterator;
public class hasNext {
	public static void main(String[]args) {
		ArrayList<Integer>a=new ArrayList<>();
		a.add(50);
		a.add(30);
		a.add(40);
		a.add(70);
		a.add(20);
		Iterator<Integer>i=a.iterator();
		while(i.hasNext());
		System.out.println(i.next());
	}
}
		
	


