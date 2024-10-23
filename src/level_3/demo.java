package level_3;
public class demo {
	public static void main(String[] args) {
		String str="java";
		System.out.println(str);
		System.out.println(touppercase(str));
	}
	public static String touppercase(String str)
	{
		String res="";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>=97&&ch<=127)
			{
				ch=32;
				res=res+ch;
			}
			else
			{
				res=res+ch;
			}
		}
		return res;
	}
}

	

