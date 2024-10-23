package pkg2;

public class current extends Account{
	public void withdraw(double amt)
	{
		if(bal-amt>=5000.0)
		{
			bal-=amt;
			System.out.println(bal);
		}
		else
		{
			System.out.println("insufficient bal");
		}
	}
	public void applyRoiofcurrent()
	{
		bal=bal+bal*0.2;
		System.out.println(bal);
	}
}
			
		
	


