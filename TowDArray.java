/****class TwoDArray
{
	public static void main (String arg[])
	{
		int [][] m=new int[3][4];
		int b=10;
		for (int i=0; i<m.length; i++)
		{
			for (int j=0; j<m[i].length; j++)
			{
				m[i][j]=b;
				b=b+10;
				//System.out.println(m[i][j]);
				System.out.println("m["+i+"]"+"["+j+"] ="+b);
			}
		}
	}
}**/




class TwoDArray
{
	public static void main(String arg [])
	{
		int [][] m=new int [2][2]
		for (int i=0; i<m.length; i++)
		{
			for (int j=0; j<m.length; j++)
			{
				m[i][j]={2,3,5,4};
				System.out.println("m["+i+"]"+"["+j+"] ="+m[i][j]);
			}
		}
	}
}