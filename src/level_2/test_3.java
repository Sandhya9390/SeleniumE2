package level_2;
import java.util .Scanner;

public class test_3 
{
	public static int sumofdiv(int num)
	{
		int sum=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
			
		}
		return sum;
	}


	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a num");
		int num=scan.nextInt();
		System.out.println(sumofdiv(num));
	}
}



	
		
		
		
	
		
	
		


	
	

