import java.util.*;

public class CalcSwitch
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


switch(ch)
{
case '+': System.out.print("="+(a+b));
break;

case '-': System.out.print("="+(a-b));
break;

case '*': System.out.print("="+(a*b));
break;

case '/': System.out.print("="+(a/b));
break;

default: System.out.print("\nEnter Valid Eq.!");
break;
}

}
}