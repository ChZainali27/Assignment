import java.util.Scanner;
public class TakeInput
{
	public static void main (String arg [])
	{
		System.out.print("Enter your marks of phy chem eng urdu maths");
		Scanner input= new Scanner (System.in);
		System.out.println("\n physics marks"); 
		  int p= input.nextInt();
		System.out.println("Chemistry marks");
		  int c= input.nextInt();	
		System.out.println("English marks");
		  int e= input.nextInt();
		System.out.println("Urdu marks");
		  int u= input.nextInt();	
		System.out.println("Maths marks");
		  int m= input.nextInt();
		
		float sum,percentage;
		sum=(p+c+e+u+m);
			
		System.out.println((sum) + " out of 500");
		System.out.println("percentage=" + (sum*100/500));
		percentage=(sum*100/500);
		if(percentage>=80 && percentage<=100)
		  System.out.println(" A+ Grade");
		if(percentage>=70 && percentage<=80)
		  System.out.println(" A Grade");
		if(percentage>=60 && percentage<=70)
		  System.out.println(" B+ Grade");
		if(percentage>=50 && percentage<=60)
		  System.out.println(" B Grade");
		if(percentage<50)
		  System.out.println(" Fail");
	else
		if(sum>500)
		   System.out.println(" WRONG DATA PLEASE CHECK YOUR INPUT");
		
	}
}