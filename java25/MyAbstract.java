
abstract class Vehicle
{
	abstract void noOfWheels();
	abstract void capacity();
}

class Bike extends Vehicle
{
	void noOfWheels()
	{
		System.out.println("\n\nWheels of Bike: "+2);
		capacity();
		noOfStands();
	}
	void capacity()
	{
		System.out.println("\n\nCapacity of Bike: "+3);
	}
	void noOfStands()
	{
		System.out.println("\n\nStands of Bike: "+2);
	}
}

abstract class Car extends Vehicle
{
	void noOfWheels()
	{
		System.out.println("\n\nWheels: "+4);
	}
}

class Defender extends Car
{
	void capacity()
	{
		noOfWheels();
		System.out.println("\n\nCapacity: "+10);
	}
}

public class MyAbstract {

	public static void main(String[] args)
	{
		Bike b = new Bike();
		Car c;	// = new Car();  as abstract, cant have object.
		
		Defender d = new Defender();
		
		b.noOfWheels();
		d.capacity();
	}

}
