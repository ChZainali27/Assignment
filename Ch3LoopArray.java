public class Ch3LoopArray
{
	public static void main(String args[]) 
	{
	/*	int a,b;
		for (a=1; a<=5; a++)
		{
			for(b=1; b<=6; b++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
	
		}
	*/

/*	output
******
******
******
******
******
*/


		


		
	/*	int a,b,c,d;
		for(a=1; a<=5; a++)
		{
			for(b=1; b<=6; b++)
			{
				System.out.print(a);
			}
			System.out.print("\n");
		}       */     
/*    output
111111
222222
333333
444444
555555
*/
	



            /*    int a,b,c;
		for(a=1; a<=10; a++)
		{
			for(b=1; b<=a; b++)
			{
				System.out.print("o");                  
			}
				
			System.out.print("\n");	
		}	*/
/* 	o    output
	oo
	ooo
	oooo
	ooooo
	oooooo
	ooooooo
	oooooooo
	ooooooooo
	oooooooooo
	ooooooooooo
*/
	



	/* 		 int a,b,c;
		for(a=1; a<=10; a++)
		{
			for(b=a; b<=10; b++)
			{
				System.out.print("o");
				System.out.print(" ");                 
			}
				
			System.out.print("\n");	
		}	*/
/*	output
oooooooooo
ooooooooo
oooooooo
ooooooo
oooooo
ooooo
oooo
ooo
oo
o
*/



		 int a,b,c;
		for(a=1; a<=6; a++)
		{
				for(b=1; b<=10; b++)
				{
					if(a>1 &&  a<6  &&  b>1  &&  b<10)
					{
						for(c=1; c<=8; c++)
						{
							System.out.print(" ");
						}
					c=c-8;
					}
					
				    System.out.print("o"); 
				}
				
			System.out.print("\n");	
		}	
	}
}


















