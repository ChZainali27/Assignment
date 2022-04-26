public class BooleanTest
{
	public static void main (String arg[])
	{
		boolean b;
		b=false;
		System.out.print("b is "+ b +"\n");
		b=true;
		System.out.print("Now b is "+ b +"\n");
		if (b) System.out.print("This is executable \n");
		b=false;
		if (b) System.out.print("This is not executable");
		System.out.print("10 > 9 is " + (10>9));
	}
}