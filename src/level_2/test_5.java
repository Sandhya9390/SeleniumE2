package level_2;

import java.util.Scanner;

public class test_5 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a num");
		int num=scan.nextInt();//5
		System.out.println(factorial(num));
	}
	public static int factorial(int num)
	{
		int fact=1;
		{
			for( ;num>0;num--)
			{
				fact=fact*num;
			}
			return fact;
		}
	}
}
		
	
	
	
		
		
	


			
		
				
				
				
	
	



