package level_1;

import java.util.Scanner;

public class demo {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int num=s.nextInt();
		int noofdiv=div(num);
		System.out.println(noofdiv);
		div(num);
	}
public static int div(int num)
{
	int count=0;
	for(int i=1;i<=num;i++)
	{
		if(num%i==0)
		{
			count++;		
		}
	}
	return count;
}
}


		
		
		
	


