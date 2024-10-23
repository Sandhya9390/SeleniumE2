package level_2;
import java.util.Scanner;

public class test_6 {
	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		System.out.println("enter a num");
		int num=scan.nextInt();
		if(spy(num))
		{
			System.out.println("spy number");
		}
		else 
		{
			System.out.println("not spy number");
		}
	}
		public static boolean spy(int num)
		{
			int sum=0;
			int prod=1;
			while(num!=0)
			{
				int rem=num%10;
				sum=sum+rem;
				prod=prod*rem;
				num=num/10;
			}
			if(sum==prod)
			{
				return true;
			}
			return false;
		}
	}

			
				
			
		
		
		
		
	
		
	


