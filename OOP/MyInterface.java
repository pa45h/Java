
class Vehicles
{
	int wheels,cap;
	
	Vehicles(int wheels, int cap)
	{
		this.wheels=wheels;
		this.cap=cap;
	}
	
	void show()
	{
		System.out.println("\n\n Wheels: "+wheels);
		System.out.println("\n\n Capacity: "+cap);
	}
}

interface Speed
{
	int sp=500;
	void spe();
}

interface Fly extends Speed
{
	int h=5000;
	void flew();
}

interface Loading
{
	int w=2000;
	void we();
}

class Plane extends Vehicles implements Fly, Loading
{
	int ahost;
	
	Plane(int w, int c, int a)
	{
		super(w,c);
		ahost=a;
	}
	void display()
	{
		show();
		System.out.println("\n\n A-Host: "+ahost);
		flew();
		spe();
		we();
	}
	
	public void flew()
	{
		System.out.println("\n\n Height: "+h);
	}
	
	public void spe()
	{
		System.out.println("\n\n Speed: "+sp);
	}
	public void we()
	{
		System.out.println("\n\n Weight: "+w);
	}
}

public class MyInterface {

	public static void main(String[] args) 
	{
		Plane p = new Plane(18,500,5);
		p.display();
	}

}
