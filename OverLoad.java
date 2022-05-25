class OverLoadDemo
{
	void test ()
	{
		System.out.println("No parameter");
	}
	void test (int a , int b)
	{
		System.out.println("int a and b is " + a +" "+ b);
	}
	void test (double a)
	{
		System.out.println("inside test (double) a=" + a);
	}
}

class OverLoad
{
	public static void main(String arg[])
	{
		OverLoadDemo ob = new OverLoadDemo();
		int i = 88;
		ob.test();
		ob.test(40,60);
		ob.test(636.54);
	}
}