class Box
{
	double height;
	double width;
	double depth;
	Box (double h, double w, double d)
	{
		height=h;
		width=w;
		depth=d;
	}
	Box ()
	{
		height=74;
		width=57;
		depth=48;
	}
	Box (double eq)
	{
		height=width=depth=eq;
	}
	double volume()
	{
		return height+width+depth;
	}
}
class OverLoad2
{
	public static void main(String arg[])
	{
		Box ob1=new Box(23,33,56);
		Box ob2=new Box();
		Box ob3=new Box(56);
		double vol;
		vol= ob1.volume();
		System.out.println("volume of ob1=" + vol + "\n");
		vol= ob2.volume();
		System.out.println("volume of ob2=" + vol + "\n");
		vol= ob3.volume();
		System.out.println("volume of ob3=" + vol + "\n");
	}
}