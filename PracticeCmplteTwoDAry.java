import java.util.Scanner;
class PracticeCmplteTwoDAry
{
	public static void main (String arg[])
	{
		//    1D_____A_R_R_A_Y
		
		/**
		int [] a=new int [5];
		a[0]=2;
		a[1]=4;
		a[2]=6;
		a[3]=8;
		a[4]=10;
		System.out.println(a[2]);
		**/
		
		
		/**
		Scanner input=new Scanner(System.in);
		int [] a=new int [16];	
		
		for (int i=0; i<a.length; i++)
		{
			int b=input.nextInt();
			a[i]=b;
			//b=b+2;
			System.out.println("a["+i+"]= "+ a[i]);
		}	
		***/
		
		
		//    LINEAR S-E-A-R-C-H
		
		
		/***
		int [] a=new  int [6];
		int index =-1;
		int key = 7;
		int b=7;
		for (int i=0; i<a.length; i++)
		{
			a[i]=b;
			b=b+1;
			System.out.println("a["+i+"]="+a[i]);
			if(a[i] == key)
			{
				index =i;
				break;
			}
		}
		if (index>-1)
		{
			System.out.println("Sucessful");
			System.out.println(a[index]+" is at "+index);
		}****/
		
		
		
		//2D_____A_R_R_A_Y
		
		/***
		int [][] a=new int [7][5];
		int b=0;
		int key= 7;
		int index=-1;
		for (int i=0; i<a.length; i++)
		{
			for (int j=0; j<a.length; j++)
			{
				a[i][j]=b;
				b++;
				System.out.println("a["+i+"]["+j+"]="+a[i][j]);
				if(a[i][j]==key)
				{
					index=i,j;
					break;
				}
			}
		}
		if(index>-1)
		{
			System.out.println("search is successful");
			System.out.println(a[index]+" is at "+index);
		}
		***/
		
		
		
		System.out.println("Normal_____2dArray");
		int a[][]=new int [3][3];
		Scanner input=new Scanner(System.in);
		for (int i=0; i<a.length; i++)
		{
			for (int j=0; j<a.length; j++)
			{
				a[i][j]=input.nextInt();
			}
		}
		for (int i=0; i<a.length; i++)
		{
			for (int j=0; j<a.length; j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		
		System.out.println(" Transpose___of_____2dArray");
		for (int i=0; i<a.length; i++)
		{
			for (int j=0; j<a.length; j++)
			{
					System.out.print(a[j][i]+" ");
			}
			System.out.println();
		}
		
		
		
	}
}