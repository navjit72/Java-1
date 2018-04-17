package april3prc1;
public class Person 
{
	String name;
	String address;
	float phoneNum;
	
	public Person(String n, String a, float num)
	{
		name = n;
		address = a;
		phoneNum = num;
	}
	
	public void setName(String n)
	{
		name = n;
	}
	
	public void setAddress(String a)
	{
		address = a;
	}

	public void setPhone(float num)
	{
		phoneNum = num;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getAddress()
	{
		return address;
	}
	
	public float getPhone()
	{
		return phoneNum;
	}	
}

