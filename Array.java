class Array
{
	public static void main (String zoro[])
	{
		int[] aa=new int[8];
		int b=0;
		for (int i=0; i<zoro.length; i++)
		{
			aa[i]=b;
			b=b+1;
			System.out.println(aa[i]);
		}
	}
}