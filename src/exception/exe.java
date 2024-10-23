package exception;
public class exe {
		public static void main(String[] args) {
			System.out.println("main started");
			try
			{
				System.out.println(3/0);
			}
			catch(ArithmeticException e)
			{
				System.out.println("exception handled");
			}
			System.out.println("main ended");
			
		}
	}


