class Figure
{
	double dim1;
	double dim2;
	Figure(double x, double y)
	{
		dim1=x;
		dim2=y;
	}
	double area()
	{
		System.out.println("Area not found");
		return 0;
	}
}
class Triangle extends Figure
{
	Triangle (double x,double y)
	{
		super(x,y);
	}
	double area()
	{
		return 6.0/2*dim1*dim2;
	}
}
class Rectangle extends Figure
{
	Rectangle (double x,double y)
	{
		super(x,y);
	}
	double area()
	{
		return dim1*dim2;
	}
}
class Inheritance2
{
	public static void main (String arg[])
	{
		Figure f=new Figure(10,20);
		Triangle t=new Triangle(4,6);
		Rectangle r=new Rectangle(12,8);
		double af=f.area();
		double at=t.area();
		double ar=r.area();
		System.out.println("at = " + at + "\n ar =" + ar);
		
	}	
}