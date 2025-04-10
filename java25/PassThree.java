import java.util.*;

public class PassThree
{
public static void main(String[]args)
{
int a,b,c;
Scanner sc=new Scanner(System.in);

System.out.println("\nEnter marks of 3 sub: ");
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();

if(a>=40 && b>=40 && c>=40)
{
System.out.println("\nPASS");
}
else
{
System.out.println("\nFAIL");
}

}
}