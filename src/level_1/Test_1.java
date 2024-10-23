package level_1;
import java.util.Scanner;

public class Test_1{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		System.out.println(sum_of_naturalnumbers(num));
	}
	public static int sum_of_naturalnumbers(int num)
	{
		int sum=0;
		for(int i=1;i<=num;i++)
		{
			sum=sum+i;
		}
		return sum;
	}
}



			
		
		
	
		
		
	
	
		
		
		
	


