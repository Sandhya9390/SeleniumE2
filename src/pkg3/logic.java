package pkg3;
public class logic {
	public static Object operation(char c)
	{
		if(c=='+')
		{
			return new Addition();
		}
		else if(c=='-')
		{
			return new substraction();
		}
		else if(c=='*')
		{
			return new multiplication();
		}
		else
		{
			return null;
		}
	}
}
	
		
	


