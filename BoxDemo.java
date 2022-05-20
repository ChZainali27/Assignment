/*class Box
{
	double height;
	double widht;
	double depth;
}
public claas BoxDemo
{
	public static void main(String arg[])
	{
	Box mybox = new Box();
	double vol;
	mybox.height = 6;
	mybox.widht = 7;
	mybox.depth = 2;
	vol= mybox.height * mybox.widht * mybox.depth;
	System.out.print("vol is = " + vol);
	}
}*/


class Box 
{
	double width;
	double height;
	double depth;
}
public class BoxDemo 
{
	public static void main(String args[]) 
	{
	Box mybox = new Box();
	double vol;
	mybox.width = 12;
	mybox.height = 376;
	mybox.depth = 159;
	vol = mybox.width * mybox.height * mybox.depth;
	System.out.println("Volume is " + vol);
	vol = mybox.width + mybox.height + mybox.depth;
	System.out.println("\n volume is " + vol);
	}
}