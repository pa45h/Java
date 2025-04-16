package kpgu;

public class Circle
{
	public double r,area;
	public double pi=3.14;
	
	public Circle(int r)
	{
		this.r=r;
		area = pi*r*r;
	}

	public void show()
	{
		System.out.print("\nRedius = "+r);	
		System.out.print("\nArea = "+area);		
	
	}

}

