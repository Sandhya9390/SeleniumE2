package level_2;
import java.util.Scanner;
public class binary {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a binary number");
		int num=scan.nextInt();
		int dec=0;
		int rev=1;
		while(num!=0)
		{
			int rem=num%10;
			dec=dec+rem*rev;
			rev=rev*2;
			num=num/10;
		}
		System.out.println("the decimal value is:"+dec);
	}
}
	
			
		
	
	


