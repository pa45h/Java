import java.util.Scanner;

class Student
{
	int id;
	String name;
	int age;
	Scanner sc = new Scanner(System.in);
	
	void input()
	{
		System.out.print("\nEnter ID: ");
		id = sc.nextInt();
		System.out.print("Enter Name: ");
		name = sc.next();
		System.out.print("Enter Age: ");
		age = sc.nextInt();
	}
	
	void output()
	{
		System.out.print("\n"+id+"\t"+name+"\t"+age);
	}
}

public class MyStudent {

	public static void main(String[] args) 
	{
		Student s[] = new Student[3];
		
		for(int i=0;i<s.length;i++)
		{
			s[i] = new Student();
			s[i].input();
		}
		
		System.out.println("\n\nId\tName\tAge");
		
		for(int i=0;i<s.length;i++)
		{
			s[i].output();
		}

	}

}
