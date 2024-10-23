package Strings;
import java.util.Scanner;
public class demo16 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a String");
		String str=scan.next();
		System.out.println(MaxOcc(str) );
		}
		public static char MaxOcc(String str) {
			int maxcount=0;
			char maxchar=' ';
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
				
				
					if(count>maxcount) 
					{
						maxcount=count;
						maxchar=ch1;
					}
			  }	
				
			
			
			
			
			return maxchar;
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


		
			
	


