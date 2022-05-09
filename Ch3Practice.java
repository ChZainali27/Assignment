public class Ch3Practice
{
	public static void main (String arg[])
	{
		/*System.out.print("Hello World");
		int a;
		a=0b101101111;
		System.out.println( "\n" + a);
		*/

		/*int s;
		s= (float)746;
		System.out.println(s);*/

		/*int x;
		x=10;
		if (x==10)
		{
			int y=20;
			System.out.println(" X and Y: " + x + " " + y);
			x=y*2;
		}	
//x is still known here
			System.out.println("\n x is now " + x);*/


	/*	int a;
		for (a=0; a<3; a++)
		{
			int b=-1;
			System.out.println("b is " + b);
			int b=100;
			System.out.println("b is now " + b);
		}
	*/


	/*	byte b;
		int i=257;
		double d=323.142;
		b = (byte) i;
		System.out.println("i and b is   " + i + " and " + b);
		i= (int) d;
		System.out.println("\n i and d is  " + i + " and " + d);
		b= (byte) d;
		System.out.println("\n b and d is " + b + " and " + d);
	*/

		byte b = 42;
		char c = 'a';
		short s = 1024;
		int i = 50000;
		float f = 5.67f;
		double d = .1234;
		double result = (f * b) + (i / c) - (d * s);
		System.out.println((f * b) + " + " + (i / c) + " - " + (d * s));
		System.out.println("result = " + result);

		// end page book 51
	}
}