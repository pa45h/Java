import java.util.*;

public class Swap
{

public static void main(String[]args)
{

int a,b,temp;
Scanner sc=new Scanner(System.in);

System.out.println("\nEnter a= ");
a=sc.nextInt();
System.out.println("\nEnter b= ");
b=sc.nextInt();

temp=a;		//a=a+b;	a=a*b;
a=b;		//b=a-b;	b=a/b;
b=temp;		//a=a-b;	a=a/b;

System.out.println("\na = "+a);
System.out.println("\nb = "+b);

}
}