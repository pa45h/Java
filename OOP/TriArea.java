import java.util.*;

class Tri
{
	double b;
	double h;
	
	void getInput()
	{
		try(Scanner sc = new Scanner(System.in))
		{
			System.out.print("\n\nEnter Base : ");
			b=sc.nextDouble();
			System.out.print("\nEnter Height : ");
			h=sc.nextDouble();
		}		
	}
	
	void area()
	{
		double a= b*h/2;
		System.out.print("\n\nArea of the triangle = "+a);
	}
}

public class TriArea {

	public static void main(String[] args) {
		
		Tri t1 = new Tri();
		
		t1.getInput();
		t1.area();
		
	}

}
