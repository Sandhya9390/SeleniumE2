package ArrayList;
import java.util.ArrayList;
public class exe1 {
	public static void main(String[] args) {
		ArrayList<Employee>a1=new ArrayList<>();
		a1.add(new Employee("abc",221,30000.0));
		a1.add(new Employee("xyz",321,40000.0));
		a1.add(new Employee("pqr",421,60000.0));
		for(Employee e1:a1)
		{
			System.out.println(e1.id);
		}
	}
}

			
		
		
	


