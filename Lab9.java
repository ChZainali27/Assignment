abstract class vehicle
 {
	int wheel;
	String color;
	double speed,fuel_tank;

	abstract void start( );
	abstract void accelerate( );
	abstract void brake( );
}
class trans_car extends vehicle
{
	int  no_doors;
	double  L_capacity;
	void properties()
	{
		System.out.println("   P R O P E R T I E S OF T R A N S P O R T CAR " );
		System.out.println(" No of doors of transport car " + no_doors);
		System.out.println(" Load capacity  of transport car " + L_capacity);
		System.out.println(" No of wheels " + wheel);
		System.out.println(" Color of transport car is " +color );
		System.out.println(" Top speed of transport car is " + speed +"kmph");
		System.out.println(" Fuel capacity of transport car " + fuel_tank);
	}
	void start()
	{
		System.out.println(" Can able to Start ");
	}
	void accelerate()
	{
		System.out.println(" Speed more than 80 ");
	}
	void brake()
	{
		System.out.println(" transport vehicle have brakes ");
	}
}
class van extends trans_car
{
	int no_doors;
	double L_capacity;
	void properties()
	{
		System.out.println("\n\n\n    P R O P E R T I E S  OF V A N  " );
		System.out.println(" No of doors of VAN " + no_doors);
		System.out.println(" Load capacity  of VAN " + L_capacity);
		System.out.println(" No of wheels " + wheel);
		System.out.println(" Color of VAN is " +color );
		System.out.println(" Top speed of VAN is " + speed +"kmph");
		System.out.println(" Fuel capacity of VAN " + fuel_tank);
	}
	void start()
	{
		System.out.println(" Can able to Start ");
	}
	void accelerate()
	{
		System.out.println(" TOP Speed is 180kmph ");
	}
	void brake()
	{
		System.out.println(" VAN have brakes ");
	}
}
class truck extends van
{
	int no_doors;
	double L_capacity;
	void properties()
	{
		System.out.println("\n\n\n    P R O P E R T I E S  OF T R U C K  " );
		System.out.println(" No of doors of TRUCK " + no_doors);
		System.out.println(" Load capacity  of TRUCK " + L_capacity);
		System.out.println(" No of wheels " + wheel);
		System.out.println(" Color of TRUCK is " +color );
		System.out.println(" Top speed of TRUCK is " + speed +"kmph");
		System.out.println(" Fuel capacity of TRUCK " + fuel_tank);
	}
	void start()
	{
		System.out.println(" Can able to Start ");
	}
	void accelerate()
	{
		System.out.println(" TOP Speed is 90kmph ");
	}
	void brake()
	{
		System.out.println(" TRUCK have brakes ");
	}
}
class Lab9
{
	public static void main (String zoro[])
	{
		trans_car tt=new trans_car();
		tt.no_doors=2;
		tt.L_capacity=300;
		tt.wheel=16;
		tt.color="blue";
		tt.speed=120;
		tt.fuel_tank=133;
		tt.properties();
		tt.start();
		tt.accelerate();
		tt.brake();
	
		van vv=new van();
		vv.no_doors=5;
		vv.L_capacity=200;
		vv.wheel=4;
		vv.color="white";
		vv.speed=180;
		vv.fuel_tank=90;
		vv.properties();
		vv.start();
		vv.accelerate();
		vv.brake();

		truck t=new truck();
		t.no_doors=3;
		t.L_capacity=500;
		t.wheel=18;
		t.color="black";
		t.speed=90;
		t.fuel_tank=150;
		t.properties();
		t.start();
		t.accelerate();
		t.brake();
	}
}