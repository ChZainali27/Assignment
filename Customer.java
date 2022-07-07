package pkg2k21gg;
public class Customer
{
	public String name;
	public double amount;
	public Customer(String n, double a)
	{
		name =n;
		amount=a;
	}
	public void show()
	{
		System.out.println(" Name = "+name+" Amount = "+amount);
	}
}
