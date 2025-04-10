import java.util.*;

public class CalcSwitch
{
public static void main(String[]args)
{

float a,b,res=0;
char op;
Scanner s=new Scanner(System.in);

System.out.println("\nEnter 2 and operation you want : ");
a=s.nextFloat();
op=s.next().charAt(0);
b=s.nextFloat();

switch(op)
{
case '+': System.out.println("="+(a+b)); break;
case '-': System.out.println("="+(a-b)); break;
case '*': System.out.println("="+(a*b)); break;
case '/': System.out.println("="+(a/b)); break;
default : System.out.println("\nENTER VALID STATEMENT"); break;
}	
}

}