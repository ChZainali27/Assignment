import java.util.Scanner;
class TwoD
{
	public static void main (String arg[])
	{
		Scanner s=new Scanner(System.in);
		int row=s.nextInt();
		int b=1;
		int clm=s.nextInt();
		int[][] num=new int[row][clm];
		for (int i=0; i<num.length; i++) //for rows
		{
			//for clm
			for (int j=0; j<num.length; j++)
			{
				num[i][j]=b;
				b=b+2;
				System.out.println("["+i+"]"+"["+j+"]= "+b);
			}
		}
		
	}
}