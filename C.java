package p3;
import p1.*;
import p2.*;
class C	
{
	public static void main (String zoro[])
	{
		System.out.println("package 1");
		A a=new A();
		//int x=a.show();
		//System.out.println(x);
		//a.msg();
		int x=a.array();
		System.out.println(x);
		
		System.out.println("package 2");
		B b=new B();
		b.m2();
		b.mm2();
	}
}