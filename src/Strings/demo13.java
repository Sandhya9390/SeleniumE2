package Strings;
import java.util.Scanner;
public class demo13 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a string");
		String str=scan.next();
		System.out.println(remDup(str));
	}
	public static String remDup(String str) {
		String result="";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(!(result.contains(ch +"")))
			{
				result=result+ch;
			}
		}
		return result;
	}
}
		
		
		
	


