class A
{
	double i;
	double j;
	A(double x,double y)
	{
		i=x;
		j=y;
	}
	void show()
	{
		System.out.println("i= " + i + "\t j= " + j);
	}
	double sum()
	{
		return i+j;
	}
}
class B extends A
{
	double k;
	B(double x,double y,double z)
	{
		super(x,y);
		k=z;
	}
	void showk()
	{
		System.out.println("i= " + i + "\t j= " + j + "\t k= " + k);
	}
	double sumk()
	{
		return sum()+k;
	}
}
class Inheritance1
{
	public static void main (String arg[])
	{
		A a1=new A(10,5);
		B b1=new B(6,4,10);
		a1.show();
		b1.showk();
		double A= a1.sum();
		double B= b1.sumk();
		System.out.println("A = " + A + "\t B =" + B);
	}	
}