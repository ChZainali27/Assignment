/***class ExceptionTest
{
	public static void main (String []zoro)
	{
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		try
		{
			System.out.println(100/2);
		}
		catch(ArithmeticException e)
		{
			System.out.println("not true statement");
		}
		System.out.println("5");
		System.out.println("6");
		System.out.println("7");
	}
}****/


/***class ExceptionTestNew
{
	public static void main(String arg[])
	{
		int a,b,c;
		a=100;
		b=2;
		try
		{
			c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException z)
		{
			System.out.println("Zero cannot be divide by hundred");
		}
		finally
		{
			System.out.println("Finally exeute");
		}
	}
	
	
	class Demothrow
	{
	Static void demoproc()
	{
		try 
		{
			NPE o=new NPE("demo");
			throw 0;
		}
		catch(NullPointerException e)
		{
			System.out.println("Caught inside demoproc");
			throw e;
		}
	}
	public static void main (String arg[])
	{
		try
		{
			demoproc();
		}
		catch(NullPointerException e)
		{
			System.out.println("Recaught "+ e);
		
		}
	}
}

	
}*****/




class FinallyException
{
	Static void procA()
	{
		try
		{
			System.out.println("Inside procA");
			throw new Runtime Exception("demo");
		}
		finally
		{
			System.out.println("procA Finally");
		}
	}
	Static void procB()
	{
		try
		{
			System.out.println("Inside procB");
			return;
		}
		finally
		{
			System.out.println("procB Finally");
		}
	}
	Static void procC()
	{
		try
		{
			System.out.println("Inside procC");
			
		}
		finally
		{
			System.out.println("procC Finally");
		}
	}
	public Static void main (String arg[])
	{
		try
		{
			procA();
		}
		catch (Exception e)
		{
			System.out.println("Exception caught");
			procB();
			procC();
		}
	}
}