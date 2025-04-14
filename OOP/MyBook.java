import java.util.*;

class Book
{
	String bName;
	String aName;
	double price;
	double dis=0.10;
	
	void input()
	{
		try(Scanner sc = new Scanner(System.in))
		{
			System.out.print("\n\nEnter Book name : ");
			bName = sc.next();
			System.out.print("\n\nEnter Auther name : ");
			aName = sc.next();
			System.out.print("\n\nEnter Book price : ");
			price = sc.nextDouble();
		}
	}
	
	void output()
	{
		double nPrice = price - (price*dis);
		System.out.println("\n\nNet Price = "+nPrice+" $");
	}
}

public class MyBook {

	public static void main(String[] args) {
		
		Book b1 = new Book();
		
		b1.input();
		b1.output();

	}

}
