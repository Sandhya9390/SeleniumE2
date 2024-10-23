package ArrayList;
import java.util.ArrayList;
public class even {
		public static void main(String[] args) {
			ArrayList<Integer>a1=new ArrayList<>();
			a1.add(45);
			a1.add(100);
			a1.add(2);
			for(int i=0;i<a1.size();i++) {
				if(a1.get(i)%2==0)
					System.out.println(a1.get(i));
			}
		}
	}



