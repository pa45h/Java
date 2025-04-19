package student;

public class Student 
{
	public int id;
	public String name;
	public int age;
	
	public Student(int id, String name, int age)
	{
		this.id=id;
		this.name=name;
		this.age=age;
	}
	
	public void show()
	{
		System.out.println("\nID = "+id);
		System.out.println("\nName = "+name);
		System.out.println("\nAge = "+age);
	}
}
