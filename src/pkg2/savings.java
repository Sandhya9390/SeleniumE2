package pkg2;

public class savings extends Account{
	public void withdraw(double amt)
	{
		if(bal>=amt)
		{
			bal=amt;
			System.out.println(bal);
		}
		else
		{
			System.out.println("insufficient bal");
		}
	}
	public void applyRoiofsavings()
	{
		bal=bal+bal*0.1;
		System.out.println(bal);
	}
}
			
		
			
	

	
	
	


