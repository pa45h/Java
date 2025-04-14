// wap to create class triangle which contains base and height while creating object and show all info without using scanner.

class Triangle
{
	double b, h, ar;
	
	Triangle(double b, double h)
	{
		this.b=b;
		this.h=h;
		
		ar=b*h*0.5;
	}
	
	void show()
	{
		System.out.print("\n\nBase = "+b);
		System.out.print("\nHeight = "+h);
		System.out.print("\nArea = "+ar);
	}
}

public class MyTriangle {

	public static void main(String[] args) 
	{
		Triangle t1 = new Triangle(3,5);
		t1.show();
		

	}

}
