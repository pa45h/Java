
class Base
{
	void show()
	{
		System.out.println("\n In show of BASE!");
	}
}

class Derived extends Base
{
	void display()
	{
		System.out.println("\n In display of DERIVED!");
	}
}

class Hello
{
	
}

public class MyInstanceOf {

	public static void main(String[] args) 
	{
		Base b = new Base();
		
		if(b instanceof Base)
		{
			System.out.println("\nB has copy of Base!");
		}
		else
		{
			System.out.println("\nB does NOT have copy of Base!");
		}
		
		if(b instanceof Derived)
		{
			System.out.println("\nB has copy of Derived!");
		}
		else
		{
			System.out.println("\nB does NOT have copy of Derived!");
		}
		
		Derived d = new Derived();
		
		if(d instanceof Derived)
		{
			System.out.println("\nD has copy of Derived!");
		}
		else
		{
			System.out.println("\nD does NOT have copy of Derived!");
		}
		
		if(d instanceof Base)
		{
			System.out.println("\nD has copy of Base!");
		}
		else
		{
			System.out.println("\nD does NOT have copy of Base!");
		}
		
//		if(d instanceof Hello)
//		{
//			error as no connection!
//		}
		
		
		
	}

}
