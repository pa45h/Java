
import student.*;

class Computer extends Student
{
	int c,cpp,java,total,pr;
	
	Computer(int id, String name, int age, int c, int cpp,int java)
	{
		super(id,name,age);
		this.c=c;
		this.cpp=cpp;
		this.java=java;
		total=c+cpp+java;
		pr=total/3;
	}
	
	void display()
	{
		super.show();
		System.out.println("\n Marks of C = "+c);
		System.out.println("\n Marks of Cpp = "+cpp);
		System.out.println("\n Marks of java = "+java);
		System.out.println("\n Total = "+total);
		System.out.println("\n Parcentage = "+pr);
	}
}

public class MyStudent {

	public static void main(String[] args) 
	{
		Computer c1 = new Computer(101,"Parth",20,91,78,69);
		c1.display();
	}

}
