package ArrayList;
import java.util.ArrayList;
public class Driver {
	public static void main(String[] args) {
		Book b1=new Book("KGF",1000.0,"Prashanth neel",100);
		Book b2=new Book("RRR",500.0,"SS Rajamouli",101);
		Book b3=new Book("Kalki",700.0,"Nag Ashwin",102);
		ArrayList<Book>libraries=new ArrayList<Book>();
		libraries.add(b1);
		libraries.add(b2);
		libraries.add(b3);
		System.out.println(libraries);
		libraries.remove(b1);
		System.out.println(libraries);
		System.out.println(libraries.contains(b2));
		System.out.println(libraries.contains(b1));
		System.out.println(libraries.remove(0));
		System.out.println(libraries);
		System.out.println(libraries.get(0));
	}

}
