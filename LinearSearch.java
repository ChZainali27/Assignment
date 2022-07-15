import java.util.Scanner;
class A
{
	int p;
	int [] b=new int[8];
	for (int i=0; i<b.length; i++)
	{
		b[i]=p;
	}
	int Find()
	{
		Scanner c=new Scanner(System.in);
		
		for (int j=0; j<9; j++)
		{
			 p=c.nextInt();
			//System.out.println(p);
			
		}
		int index=-1;
		int k=8;
		for (int i=0; i<b.length; i++)
		{
			if (b[i]==k)
			{
				//System.out.println("Keyword is availavle");
				index=b[i];
				System.out.println("Key is present at "+"index["+i+"]");
			}
		}
		
		return 0;
	}
	
}
class LinearSearch
{
	public static void main(String zoro[])
	{
		A a=new A(zoro);
		a.Find();
	}
}