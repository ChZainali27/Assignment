class Sea
{
	double height;
	double width;
	double depth;
	void area ()
	{
		System.out.println("Volume is ");
		System.out.println(height * width * depth);
	}
}

public class Sea1
{
	public static void main (String arg[])
	{
		Sea deepsea1 = new Sea();
		Sea deepsea2 = new Sea();
		
		deepsea1.height=54;
		deepsea1.width=75;
		deepsea1.depth=82;

		deepsea2.height=42;
		deepsea2.width=33;
		deepsea2.depth=3;
		
		deepsea2.area();
		deepsea1.area();
	}
}