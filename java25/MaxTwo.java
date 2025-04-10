import java.util.*;

public class MaxTwo
{
public static void main(String[]args)
{
int a,b;
Scanner sc=new Scanner(System.in);

System.out.print("\nEnter a: ");
a=sc.nextInt();
System.out.print("\nEnter b: ");
b=sc.nextInt();

if(a>b)
{
System.out.print("\na is max");
}
else
{
System.out.print("\nb is max");
}

}
}