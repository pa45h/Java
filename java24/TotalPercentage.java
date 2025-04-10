// WAP to enter 3 marks and print total and percentage.

import java.util.*;

public class TotalPercentage
{
public static void main(String[]args)
{

int m1,m2,m3,t;
float p;
Scanner s=new Scanner(System.in);

System.out.println("\nEnter M1 : ");
m1=s.nextInt();
System.out.println("\nEnter M2 : ");
m2=s.nextInt();
System.out.println("\nEnter M3 : ");
m3=s.nextInt();

t=m1+m2+m3;
p=t/3f;
System.out.println("\nTotal = "+t);
System.out.println("\nPercentage = "+p);

}
} 