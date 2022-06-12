  /*
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


import java.util.Scanner;
class Human
{
	public static void main (String zain[])
	{
	
		int a,b,c;
		a=20;
		b=30;
		c=40;
		System.out.println(" a is = " + a + "\n b is = " + b + "\n c is = " + c);
		System.out.println(" My First Program for papers prepration");
		char a,b,c,d,e,f,g,h,i,j;
		float x;
		a=65;
		b=109;
		c=90;
		d=97;
		e=105;
		f=110;
		x=5685.6677f;
		System.out.println("My password is \t" + "'"+a+b+" "+c+d+e+f+"'");
		System.out.println("Float is " + x);
	
		
		Scanner input=new Scanner (System.in);
		
		int f;
		int d=input.nextInt();
		int e=input.nextInt();
		f=d+e;
		boolean a,b;
		a=true;
		b=false;
		if(f==15)
		
		{
			System.out.println("f is " + a);
		}
		else
		{
			System.out.println("f is " + b);
		}


		Scanner input=new Scanner (System.in);
		String p,q;
		String z=input.nextString();
		p="am-zain";
		if(z==p)
		{
			
			System.out.println("pass");
		}
		else
		{
			System.out.println("No entry");
		}





		 int g=0x56526;
		System.out.println("for binary " + g);
	
		int x;
		for(x=0; x<=3; x++)
		{
			System.out.println("x=-1" + "\n x=100");
		}
	

		int a=30;
		int c=257;
		byte b,d;
		b=(byte)a;
		d=(byte)c;
		System.out.println(b);
		System.out.println(d);	
		

		int dec=122;
		int hexa=0x234;
		int octal=05352;
		int binary=0b10011010;
		System.out.println(" dec "+dec+"\n hexa "+hexa+"\n octal "+octal+"\n binary "+binary);
		
		int myint=10;
		double mydouble;
		mydouble=myint;
		System.out.println(" my int is "+myint+"\n my double "+mydouble);
			
	}
}	



class Box
{
	double w;
	double h;
	double d;
	Box(double w,double h,double d)
	{
		w=w;
		h=h;
		d=d;
		System.out.println("  w h and d  are  "+ w +"\t"+ h +"\t"+ d);
	}
	Box()
	{
		w=2;
		h=3;
		d=5;
	}
	Box(int a,int b)
	{
		w=a;
		h=b;
	}
	void volume()
	{
		return width*height*depth;
	}
	void eating() 
	{
		System.out.println();
	}	
}
class Member
{
	public static void main(String abc[])
	{
		Human saad=new Human();
		Human ahmad=new Human();
		Human b3=new Human();
		Human b4=new Human();
		saad.height=6;
		saad.weight=80;
		System.out.println(" saad height"+saad.height+"\n saad weight"+saad.weight);
				
		ahmad.height=5;
		ahmad.weight=60;
		System.out.println(" ahmad height"+ahmad.height+"\n ahmad weight"+ahmad.weight);
		b3.eating();
		b4.running();   

		Human A=new Human();
		Human B=new Human();
		Human C=new Human();
		Human D=new Human();
		B.height=60;
		C.depth=45;
		D.width=70;
		System.out.println(B.width*C.height*D.depth);
		A.total();
	
		double x,z;
		Box b1=new Box(2,3,5);
		Box b2=new Box();
		Box b3=new Box(2,3);
		
		System.out.println(" without parameter   " + (b2.w+b2.h+b2.d));
		System.out.println(" 2 parameter   "+(b3.w*b3.h) );
				
	}	
}





class Method
{	
	int a,b,c;
	void over()
	{
		a=2;
		b=3;
		c=5;
		System.out.println("  Simple method  "+a+b+c);
	}
	void over(int x,int y)
	{
		a=x;
		b=y;
		System.out.println(" method receiving value  "+ (a+b));
	}	
	int error()
	{
		a=2;
		b=2;
		c=4;
		return a+b+c;
	}
	int over(int x,int y,int z)
	{
		a=x;
		b=y;
		c=z;
		System.out.println(" receiving and returning value  "+ (a+b+c));
		return a*b*c;
	}
}
class Member
{
	public static void main(String zain[])
	{
		int p,q;
		Method aa=new Method();
		aa.over();
		aa.over(5,5);
		aa.a=2;
		aa.b=2;
		aa.c=4;
		System.out.println(" only returning value " + aa.error());
		aa.over(2,3,5);
		q=aa.over(2,2,2);
		System.out.println(q);
	}
}



class Parameter
{
	String x,y,z;
	Parameter(int a,int b,String c)
	{
		x=a;
		y=b;
		z=c;
		System.out.println("  Sum " + c);
	}
}
class Member
{
	public static void main (String zain[])
	{
		Parameter p=new Parameter(2,3.3,"zain");
		
	}	
}


class A
{
	int i,j;
	A(int x,int y)
	{
		i=x;
		j=y;
	}
	void show()
	{
		System.out.println(" i = "+i+"\t j = "+j);
	}	
	int sum()
	{
		System.out.println("i + j "+ (i+j));
	}
}
class B extends A
{
	int q;
	B (int x,int y,int z)
	{
		super(x,y);
		q=z;
	}
	void showk()
	{
		System.out.println(show() + " q = "+q);
	}
	int sumk()
	{
		System.out.println(sum() + q);
	}
}
class Member
{
	public static void main (String zain[])
	{
		A a1=new A(2,3);
		a1.show();
		a1.sum();
	}	
}*/

class A
{
	int i,j;
	A(int x,int y)
	{
		i=x;
		j=y;
	}
	int show()
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
	int k;
	B(int x,int y,int z)
	{
		super(x,y);
		k=z;
	}
	int showk()
	{
		System.out.println("i= " + i + "\t j= " + j + "\t k= " + k);
	}
	double sumk()
	{
		return sum()+k;
	}
}
class PaperPractice
{
	public static void main (String arg[])
	{
		A a1=new A(2,3);
		B b1=new B(4,1,6);
		a1.show();
		b1.showk();
		double A=a1.sum();
		double B=b1.sumk();
		System.out.println("A = " + A + "\t B =" + B);
	}	
}


















