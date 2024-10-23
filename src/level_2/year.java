package level_2;
import java.util.Scanner;
public class year {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter year");
		int year=scan.nextInt();
		if(year%400==0||year%4==0&&year%100!=0)
		{
			System.out.println("leap year");
		}
		else
		{
			System.out.println("not a leap year");
		}
	}
}



