import java.util.*;

public class Max
{
public static void main(String[]args)
{

int a,b,c;
Scanner sc=new Scanner(System.in);
System.out.println("\nEnter A , B & C : ");
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();

if(a>b)
{
if(a>c)
{
System.out.println("\nA is Max");
}
else
{
System.out.println("\nC is Max");
}
}
else
{
if(b>c)
{
System.out.println("\nB is Max");
}
else
{
System.out.println("\nC is Max");

}
}

}
}

/*if(a>b && a>c)

  {
	A
	}
  else if(b>c)
  {
	B
	}
  else
  {
	C
     }*/