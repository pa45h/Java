import java.util.*;

public class CalcLadder
{
public static void main(String[]args)
{

double a,b;
char ch;
Scanner sc= new Scanner(System.in);

System.out.print("Enter your equation: ");
a=sc.nextDouble();
ch=sc.next().charAt(0);
b=sc.nextDouble();


if(ch=='+')
{
System.out.print("="+(a+b));
}
else if(ch=='-')
{
System.out.print("="+(a-b));
}
else if(ch=='*')
{
System.out.print("="+(a*b));
}
else if(ch=='/')
{
System.out.print("="+(a/b));
}
else
{
System.out.print("\nEnter Valid Eq.!");
}


}
}