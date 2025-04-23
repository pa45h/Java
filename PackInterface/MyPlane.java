import fly.*;
import loading.*;
import vehicle.*;

class Plane extends MyVehicle implements MyFly, MyLoading
{
	int ahost;
	
	Plane(int wheels, int capacity, int ahost)
	{
		super(wheels,capacity);
		this.ahost=ahost;
	}
	
	void display()
	{
		super.show();
		flew();
		we();
		System.out.println("\nA-Host = "+ahost);
	}
	
	public void flew()
	{
		System.out.println("\nHeight = "+height);
	}
	
	public void we()
	{
		System.out.println("\nWeight = "+weight);
	}
}

public class MyPlane {

	public static void main(String[] args) 
	{
		Plane p1 = new Plane(18,100,10);
		p1.display();
	}

}
