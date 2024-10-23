package level_2;
import java.util.Scanner;
public class gcd {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter num1");
		int num1=scan.nextInt();
		System.out.println("enter num2");
		int num2=scan.nextInt();
		int gcd=0;
		int res=(num1<num2)?num1:num2;
		for(int i=1;i<=res;i++)
		{
		if(num1%i==0&&num2%i==0)
		{
			//system.out.println(i);
			gcd=i;
		}
	}
		System.out.println(gcd);
	}
}

	
					
		
	


