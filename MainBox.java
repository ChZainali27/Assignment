class Box
{
	double width,height,depth;

	Box ()
	{
		width = -1;
		height = -1;
		depth = -1;
	}

	Box (double c)
	{
		width=height=depth=c;
	}
	
	Box (double w, double h, double d)
	{
		width = w;
		height = h;
		depth = d; 
	}
	
	Box (int c)
	{
		width=height=depth=c;
	}	
}

class MainBox
{
	public static void main (String arg[])
	{
		Box obj1= new Box();
		Box obj2= new Box(2.5);
		Box obj3= new Box(4,6,7);
		Box obj4= new Box(7);
		System.out.println(obj1);
		
	}	
}

