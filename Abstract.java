abstract class Figure
{
	double dim1,dim2;
	Figure(double x, double y)
	{
		dim1=x;
		dim2=y;
	}
	abstract double show();
	/**{
		System.out.println(" Hello its zain ");
		return 0;
	}**/
}
class Triangle extends Figure
{
	Triangle (double x, double y)
	{
		super(x,y);
	}
	double show ()
	{
		return dim1+dim2;
	}
}
class Square extends Figure
{
	Square (double x, double y)
	{
		super (x,y);
	}
	double show ()
	{
		return dim1*dim2;
	}
}
class Abstract
{
	public static void main (String zain[])
	{
		Figure ff;//=new Figure(2,3);
		Triangle tt=new Triangle(4,5);
		Square ss=new Square(5,5);
		//double f=ff.show();
		double t=tt.show();
		double s=ss.show();
		//System.out.println(" Figure is " + f);
		System.out.println(" Triangle is " + t);
		System.out.println(" Square is " + s);
		ff=new square(1000*2);
		System.out.println(" now ff is " + ff);
	}
}