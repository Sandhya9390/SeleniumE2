package Strings;
public class demo7 {
	public static void main(String[] args) {
		String str="programming";
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
			case'u':System.out.println(ch);
					
			
			
			}
			
		}
	}

}
