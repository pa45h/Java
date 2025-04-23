package vehicle;

public class MyVehicle 
{
	public int wheels, capacity;
	
	public MyVehicle(int wheels, int capacity)
	{
		this.wheels=wheels;
		this.capacity=capacity;
	}
	
	public void show()
	{
		System.out.println("\nWheels = "+wheels);
		System.out.println("\nCapacity = "+capacity);
	}
}
