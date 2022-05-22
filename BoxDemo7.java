class Box122
{
	double height;
	double width;
	double depth;
	Box122 ()
	{
		System.out.println("constructing box");
		height=65;
		width=43;
		depth=22; 	
	}
	
	double volume()
	{
		//return height * width * depth;
		return height + width + depth;	
	}
}

public class BoxDemo7
{
	public static void main(String arg[])
	{
		Box122	mybox1= new Box122();
		Box122	mybox2= new Box122(); 
		
		double vol;
		vol=mybox1.volume();
		System.out.println("violume is " + vol);
 	
	}
}