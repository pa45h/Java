import java.util.*;

public class Calc
{
public static void main(String[]args)
{

float a,b,res=0;
char op;
Scanner s=new Scanner(System.in);

System.out.println("\nEnter 2 no.: ");
a=s.nextFloat();
b=s.nextFloat();

System.out.println("\nEnter operator(+,-,*,/): ");
op=s.next().charAt(0);

if(op=='+')
{
res=a+b;
}
else if(op=='-')
{
res=a-b;
}
else if(op=='*')
{
res=a*b;
}
else if(op=='/')
{
res=a/b;
}
System.out.println("\n"+a+" "+op+" "+b+" = "+res);
}
}