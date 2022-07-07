package pkg2k21gg;
public class Member 
{
	public String nam;
	public double amnt;
	public Member(String n, double a)
	{
		nam =n;
		amnt=a;
	}
	public void shows()
	{
		System.out.println(" Name = "+nam+" Amount = "+amnt);
	}
}