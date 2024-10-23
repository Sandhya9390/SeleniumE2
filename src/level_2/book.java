package level_2;
import java.util.Scanner;
public class book {
	public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			System.out.println("enter a num");
			int num=scan.nextInt();
			if(palindrome(num))
			{
				System.out.println("palindrome number");
			}
			else
			{
				System.out.println("not palindrome number");
			}
		}

	public static boolean palindrome(int num)
	{
		int temp=num;
		int rev=0;
		while(num!=0);
		{
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		if(temp==rev)
		{ 
			return true;
		}
		    return false;
	}
}



