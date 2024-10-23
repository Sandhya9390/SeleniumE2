package pkg2;
public class Account {
	double bal;
	public void deposit(double amt)
	{
		bal+=amt;
		System.out.println(bal);
	}
	public void checkBal()
	{
		System.out.println(bal);
	}

}
