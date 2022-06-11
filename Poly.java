class A
{
	void show()
	{
		System.out.println("As show");
	}	
}
class B extends A
{
	void show()
	{
		System.out.println("Bs show");
	}
}
class C extends A
{
	void show()
	{
		System.out.println("Cs show");
	}
}
class Poly
{
	public static void main (String arg[])
	{
		A aa=new A();
		B bb=new B();
		C cc=new C();
		aa.show();
		bb.show();
		cc.show();
		A var;
		var=new A();
		var.show();
		
		var=new B();
		var.show();
		
		var=new C();
		var.show();	
	
	}	
}