package level_1;
import java.util.Scanner;

public class abc {
			public static void main(String[]args) {
			Scanner s=new Scanner(System.in);
			System.out.println("enter a num");
			int num = s.nextInt();
			if(isprime(num))
			{
				System.out.println("prime number");
			
			}
			else
			{
				System.out.println("not a prime number");
			}
			}

public static boolean isprime(int num) {
	
	if(num==0||num==1) 
	{
		return false;
	}
	
		int count=0;
	
		for(int i=1;i<=num;i++)
		{
	        if(num%i==0)
			{
				count++;
			}
		}
			if(count==2)
			{
				return true;
			}
			else
			{
			    return false;
			
			}
		}
}

		
	
			
			
			

				
			
			
			
			
			
			
			
			
			
			
				
			
				
