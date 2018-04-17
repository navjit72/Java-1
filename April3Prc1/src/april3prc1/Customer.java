package april3prc1;
public class Customer extends Person 
{
	private double customerNum;
	private String accept;
	
	public Customer(String n, String a, float phoneN, String acc, float cNum)
	{
		super(n, a, phoneN);
		customerNum = cNum;
		accept = acc;
	}
	
	public void setCustomerNum(double cNum)
	{
		customerNum = cNum;
	}

	public void setAccept(String acc)
	{
		accept = acc;
	}
	
	public double getCustomerNum()
	{
		return customerNum;
	}
	
	public String getAccept()
	{				
		return accept;
	}	
}