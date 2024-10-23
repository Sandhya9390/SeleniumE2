package Strings;
public class demo8{
	public static void main(String[] args) {
		String str="programming";
		int count=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			switch(ch)
			{
			case'A':
			case'E':
			case'I':
			case'O':
			case'U':
			case'a':
			case'e':
			case'i':
			case'o':
			case'u':count++;
			}
		}
			System.out.println("total vowels are:" +count);
			
					
			
			
			}
			
		}
	



	


