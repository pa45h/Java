
class Employee
{
	int id;
	String name;
	
	Employee(int id, String name)
	{
		this.id=id;
		this.name=name;
	}
	
	void show()
	{
		System.out.print("\n\nEmp Id = "+id);
		System.out.print("\nEmp Name = "+name);
	}
	
	void show(int a) 			// Method OverLoading
	{}
	
	void show(int a, String b)	// Method OverLoading
	{}
	
}

class Permanent extends Employee
{
	double sal,hra,da,total;
	
	Permanent(int id, String name, double sal)
	{
		super(id,name);
		this.sal=sal;
		hra=sal*0.10;
		da=sal*0.01;
		total=sal+hra+da;
	}
	
	void show()					//Method OverRiding
	{
		super.show();
		System.out.print("\nEmp Salary = "+total);
	}
}

class Daily extends Employee
{
	int hrs, pay, total;
	
	Daily(int id, String name, int hrs)
	{
		super(id,name);
		this.hrs=hrs;
		pay=1000;
		total=hrs*pay;
	}
	
	void show()
	{
		super.show();
		System.out.print("\nEmp Salary = "+total);
	}
}

public class MyEmployee {

	public static void main(String[] args) 
	{
		Permanent p1 = new Permanent(101,"Parth",100000);
		p1.show();
		
		Daily d1 = new Daily(102,"Madaniyu",2);
		d1.show();
		
	}

}
