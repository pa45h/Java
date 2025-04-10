// wap to create class employee which contains id, name, salary, tax 10%, and net salary. ask user to enter id, name, salary find tax and net salary and print all info.

import java.util.*;

class Emp
{

int id;
String name;
float sal;
float tax = 0.10f;
float netSal;

Scanner sc = new Scanner(System.in);

void getInput()
{

System.out.print("\n\nEnter Id : ");
id=sc.nextInt();

System.out.print("\nEnter Name : ");
name=sc.next();

System.out.print("\nEnter Salary : ");
sal=sc.nextFloat();

}

void getOutput()
{

netSal = sal + (sal*tax);

System.out.print("\n\nId = "+id);
System.out.print("\nName = "+name);
System.out.print("\nSalary = "+sal);
System.out.print("\nNet Salary = "+netSal);

}y

}


public class MyEmp
{
public static void main(String[]args)
{

Emp e1 = new Emp();

e1.getInput();
e1.getOutput();

}
}























