package recursion;
public class A {
	public static void main(String[] args) {
		print(1,5);
	}
		public static void print(int i,int num) {
		
			if(i>num)
			System.out.println(i);
			print(++i,num);
		}
	}

				
			
		
