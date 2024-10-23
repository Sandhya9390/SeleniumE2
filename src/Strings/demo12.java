package Strings;
import java.util.Scanner;
public class demo12 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a string");
		String str=scan.next();
		frequency(str);
	}
	public static void frequency(String str)
	{
		for(int i=0;i<str.length();i++) {
			int count=0;
			char ch1=str.charAt(i);
	    for(int j=0;j<str.length();j++)
	    {
	    	char ch2=str.charAt(j);
	    	if(ch1==ch2)
	    	{
	    		count++;
	    	}
	    }
	    System.out.println(ch1+"frequency is: "+count);
	    	}
	    }
}

		
	


