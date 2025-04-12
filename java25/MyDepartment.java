
class student
{
	int id;
	String name;
	
	student(int id, String name)
	{
		this.id=id;
		this.name=name;
	}
	
	void show()
	{
		System.out.println("\n\nId = "+id);
		System.out.println("\nName = "+name);
	}
}

class Ce extends student
{
	int c, cpp, Java;
	
	
	Ce(int id, String name, int c, int cpp, int Java)
	{
		super(id,name);
		this.c=c;
		this.cpp=cpp;
		this.Java=Java;
	}
	
	int total(int c, int cpp, int java)
	{
		return (c+cpp+java);
	}
	
	void show()
	{
		super.show();
		System.out.println("\nC Marks = "+c);
		System.out.println("\nCpp Marks = "+cpp);
		System.out.println("\nJava Marks = "+Java);
		System.out.println("\nTotal Marks = "+total(c,cpp,Java));
		System.out.println("\nPr = "+total(c,cpp,Java)/3);
	}
}

class Mech extends student
{
	int egd, mos, eee;
	
	
	Mech(int id, String name, int egd, int mos, int eee)
	{
		super(id,name);
		this.egd=egd;
		this.mos=mos;
		this.eee=eee;
	}
	
	int total(int egd, int mos, int eee)
	{
		return (egd+mos+eee);
	}
	
	void show()
	{
		super.show();
		System.out.println("\nC Marks = "+egd);
		System.out.println("\nCpp Marks = "+mos);
		System.out.println("\nJava Marks = "+eee);
		System.out.println("\nTotal Marks = "+total(egd,mos,eee));
		System.out.println("\nPr = "+total(egd,mos,eee)/3);
	}
}

public class MyDepartment {

	public static void main(String[] args) 
	{
		Ce c1 = new Ce(101,"Parth",20,30,25);
		c1.show();
		
		Mech m1 = new Mech(102,"Parth",35,29,25);
		m1.show();
	}

}
