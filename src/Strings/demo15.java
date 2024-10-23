package Strings;
import java.util.Scanner;
public class demo15 {
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter a String");
	String str=scan.next();
	System.out.println("Min_Occ char is "+MinOcc(str) );
	}
	public static char MinOcc(String str) {
		int mincount=str.length();
		char minchar=' ';
		String result=remDup(str);
		for(int i=0;i<result.length();i++)
		{
			int count=0;
			char ch1=result.charAt(i);
			for(int j=0;j<str.length();j++) 
			{
				char ch2=str.charAt(j);
				if(ch1==ch2)
				{
					count++;
				}
			}
				if(count<mincount) {
					mincount=count;
					minchar=ch1;
				}

			
		}
		return minchar;
	}
	
	public static String remDup(String str) {
		String result="";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(!(result.contains(ch+ "")))
			{
				result=result+ch;
				}
			}
			return result;
		}
}


	
		