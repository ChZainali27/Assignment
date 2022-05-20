class Box
{
	double height;
	double width;
	double depth;
}
class BoxDemo2
{
	public static void main(String arg[])
	{
		Box mybox1= new Box();
		Box mybox2= new Box();
		double vol;
		mybox1.height = 23;
		mybox1.width = 43;
		mybox1.depth = 54;
		vol = mybox1.height * mybox1.width + mybox1.depth;
		System.out.println("volume is " + vol);

		mybox2.height = 3;
		mybox2.width = 65;
		mybox2.depth = 4;
		vol = mybox2.height * mybox2.width + mybox2.depth;
		System.out.println("volume is " + vol);
	}
}