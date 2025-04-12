// wap to create class employee which contains id, name, salary, tax 10%, and net salary. ask user to enter id, name, salary find tax and net salary and print all info.

import java.util.*;
 
class Emp
{
	int id;
	String name;
	int sal;
	double tax = 0.10;
	double nsal;
	
	void getInput()
	{
		try (Scanner sc = new Scanner(System.in)) 
		{
			System.out.print("\nEnter Id: ");
			id=sc.nextInt();
			System.out.print("\nEnter Name: ");
			name=sc.next();
			System.out.print("\nEnter Salary: ");
			sal=sc.nextInt();
		}
	}
	
	void getOutput()
	{
		nsal = sal - (sal*tax);
		System.out.println("\n\nId = "+id);
		System.out.println("Name = "+name);
		System.out.println("Salary = "+sal);
		System.out.println("Tax = "+(sal*tax));
		System.out.println("Net Salary = "+nsal);
	}
}

public class MyEmp
{
	public static void main(String[]args)
	{
		Emp e = new Emp();
		e.getInput();
		e.getOutput();
	}
}