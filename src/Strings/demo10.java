package Strings;
import java.util.Scanner;
public class demo10 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a string");
		String str=scan.next();
		System.out.println(tolowerCase(str));
	}
	public static String tolowerCase(String str)
	{
		String res="";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch>='A'&&ch<='Z'){
				ch+=32;
				res=res+ch;
			}
			else {
				res=res+ch;
			}
		}
		return res;
	}
}
	


