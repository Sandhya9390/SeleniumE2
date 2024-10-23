package level_2;
import java.util.Scanner;
public class pen
{
	public static boolean isperfect(int num)
	{
		int sum=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
		}
			if(sum==num)
			{
				return true;
			}
			    return false;
	}

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a num");
		int num=scan.nextInt();
		if(isperfect(num))
		{
			System.out.println("perfect number");
		}
		else
		{
			System.out.println("not a perfect number");
		
		}
	}
}
			
		
	

		
	
			
		
	



