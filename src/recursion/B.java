package recursion;
public class B {
	public static void main(String[] args) {
		System.out.println(print(1,5,0));
	}
		
	public static int print(int i,int num,int sum)
	{
		if(i>num)return sum;
		sum+=i;
		return print(++i,num,sum);
	}
}
		
	


