
class Clg
{
	String cName;
	String city;
	
	Clg(String cName, String city)
	{
		this.cName=cName;
		this.city=city;
	}
	
	void show()
	{
		System.out.print("\n\nCollege Name = "+cName);
		System.out.print("\n\nCity = "+city);
	}
}

interface Canteen
{
	int price = 50;
	void display();
}

interface Bus
{
	int fees = 12500;
	void output();
}

class Studnt extends Clg implements Canteen,Bus
{
	int sId;
	String sName;
	int age;
	
	Studnt(String cName, String city, int sId, String sName, int age)
	{
		super(cName,city);
		this.sId=sId;
		this.sName=sName;
		this.age=age;
	}
	
	void show()
	{
		super.show();
		display();
		output();
		System.out.print("\n\nStudent Id = "+sId);
		System.out.print("\n\nStudent Name = "+cName);
		System.out.print("\n\nStudent age = "+age);
	}
	
	public void display()
	{
		System.out.print("\n\nCollege Fees = "+fees);
	}
	
	public void output()
	{
		System.out.print("\n\nCanteen Price = "+price);
	}
}

public class CollegeInterface {

	public static void main(String[] args) 
	{
		Studnt s1 = new Studnt("Svit","Vasad",101,"Babita",20);
		s1.show();
	}

}
