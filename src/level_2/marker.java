package level_2;
import java.util.Scanner;
public class marker {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a num");
		int num=scan.nextInt();
		int a=0;
		int b=1;
		for(int i=1;i<=num;i++)
		{
			System.out.println(a+ " ");
			int c=a+b;
			a=b;
			b=c;
		}
	}
}
			
			
			
			
			
			
		
	

