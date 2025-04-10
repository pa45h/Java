// wap to create class student which contains id, name, 3 marks, total percentage and ask user to enter id, name and 3 marks and display all info with total percentage.

import java.util.*;

class Student
{
int id;
String name;
int m1,m2,m3;
float pr;

Scanner sc = new Scanner(System.in);

void getInput()
{
System.out.print("\n\nEnter Id : ");
id=sc.nextInt();

System.out.print("\n\nEnter Name : ");
name=sc.next();

System.out.print("\n\nEnter M1 : ");
m1=sc.nextInt();

System.out.print("\n\nEnter M2 : ");
m2=sc.nextInt();

System.out.print("\n\nEnter M3 : ");
m3=sc.nextInt();
}

void getOutput()
{
int total = m1+m2+m2;

System.out.print("\n\nId = "+id);
System.out.print("\nName = "+name);
System.out.print("\nTotal = "+total);
System.out.print("\nPercent = "+(total/3f));

}
}

public class MyStudent
{
public static void main(String[]args)
{

Student s1 = new Student();
Student s2 = new Student();

s1.getInput();
s2.getInput();

s1.getOutput();
s2.getOutput();

}
}









