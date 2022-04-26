public class Light
{
	public static void main (String arg[])
	{
		System.out.print("Hello World \n");
		int lightspeed=186000;
		int days=1000;
		long seconds=days*24*60*60;
		long distance=lightspeed*seconds;
		/*System.out.print("In " + days);
		System.out.print(" days light will travel about ");
		System.out.print(distance + " miles");*/
		System.out.print("In "+ days +" distance will travel about "+ distance +" miles");
	}
}