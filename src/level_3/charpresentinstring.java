package level_3;
import java.util.Scanner;
public class charpresentinstring {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a string");
		String str=scan.next();
		System.out.println("enter a char");
		char ch=scan.next().charAt(0);
		System.out.println(contains(str,ch));
	}
	public static boolean contains(String str,char ch)
	{
		for(int i=0;i<str.length();i++)
		{
			char ch2=str.charAt(i);
			if(ch==ch2)
			{
				return true;
			}
		}
		return false;
	}
}
			
