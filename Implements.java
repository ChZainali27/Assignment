/****interface Bank
{
	float rateofinterest();
}
class SBI implements Bank
{
	public float rateofinterest()
	{
		return 34.22f;
	}
}
class PNB implements Bank
{
	public float rateofinterest()
	{
		return 64.32f;
	}
}
class Implements
{
	public static void main (String zoro[])
	{
		SBI ss=new SBI();
		//float a=ss.rateofintrest();
		System.out.println(s.rateofintrest());
		PNB pp=new PNB();
		//float b=p.rateofintrest();
		System.out.println(pp.rateofintrest());
	}
}*******/





interface Drawback
{
	float Draw();
}
class Rect implements Drawback
{
	public float Draw()
	{
		//System.out.println("Drawing Rectangle");
		return 34f;
	}
}
class Circle implements Drawback
{
	public float Draw()
	{
		//System.out.println("Drawing Circle");
		return 44f;
	}
}
class Implements 
{
	public static void main (String zoro[])
	{
		Rect r=new Rect();
		float a=r.Draw();
		Circle c=new Circle();
		float b=c.Draw();
		System.out.println(a);
		System.out.println(b);
	}
}