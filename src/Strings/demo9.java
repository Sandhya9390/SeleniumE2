package Strings;
public class demo9 {
	public static void main(String[] args) {
		String str="programming";
	   
		System.out.println(toupperCase(str));
	}
	public static String toupperCase(String str) {
		String res="";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch>='a'&&ch<='z') {
				ch-=32; 
				res=res+ch;
			}
			else {
				res=res+ch;
			}
		}
		return res;
	}
}
			
