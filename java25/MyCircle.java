// wap to find the area of circle.

import java.util.*;

class Circle
{
float pi = 3.14f, rad, area;
Scanner scan = new Scanner(System.in);

void getInput()
{
System.out.print("\n\nEnter Radius: ");
rad = scan.nextInt();
}

void getArea()
{
area = pi*rad*rad;
System.out.print("\n\nRadius: "+rad);
System.out.print("\n\nArea : "+area);
}

}

public class MyCircle
{
public static void main(String[]args)
{

Circle c;	// c is reference variable. By default initialized with null. 

c = new Circle();	// new Circle() is an object.

Circle c1 = new Circle();
Circle c2 = new Circle();

c.getInput();
c1.getInput();
c2.getInput();

c.getArea();
c1.getArea();
c2.getArea();

}
}
