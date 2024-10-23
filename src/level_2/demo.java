package level_2;
import java.util.Scanner;

public class demo {
	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		System.out.println("enter a num");
		int num=scan.nextInt();
		if(harshad(num))
		{
			System.out.println("harshad number");
		}
		else 
		{
			System.out.println("not harshad number");
		}
	}
        public static boolean harshad(int num)
	    {
		   int sum=0;
		   int temp=num;
		   while(num!=0) 
		{
			int rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
			if(temp%sum==0)
		{
			return true;
		}
		return false;
		    
		}
}

		  
	


	
	
	

		
	

