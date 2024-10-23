package ArrayList;
import java.util.ArrayList;
public class execution {
public static void main(String[] args) {
	ArrayList<student>a1=new ArrayList<>();
	a1.add(new student("abc",30,25,234567890L));
	a1.add(new student("xyz",80,60,1234567890L));
	System.out.println(a1);
}
}
