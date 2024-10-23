package level_2;
import java.util.Scanner;
public class decimal {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a decimal number");
		int num=scan.nextInt();
		int bin=0;
		int rev=1;
		while(num!=0)
		{
			int rem=num%2;
			bin=bin+rem*rev;
			rev=rev*10;
			num=num/2;
		}
		   System.out.println(" the binary value is: "+bin);
		}
	}




