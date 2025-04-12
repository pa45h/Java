
class Base1
{
	void show()
	{
		System.out.println("Show in Base");	
	}
	void display()
	{}
	void disp()
	{}
}

class Derived1 extends Base1
{
	void display()
	{
		System.out.println("Display in Derived");	
	}
}

class Child1 extends Derived1
{
	void disp()
	{
		System.out.println("Disp in Child");	
	}
}

public class MyDynamicDispatched {

	public static void main(String[] args) 
	{
		Derived1 d1 = new Derived1();
		System.out.println("\nObject of Derived");	
		d1.show();
		d1.display();
		
		Base1 b1 = new Base1();
		System.out.println("\nObject of Base");	
		b1.show();
//		b1.display();
		
		Base1 db = new Derived1();
		System.out.println("\nDynamic Method Dispatched");	
		db.show();
		db.display();
		
		System.out.println("\nDynamic Method Dispatched");	
		db=new Child1();
		db.show();
		db.display();
		db.disp();
	}

}
