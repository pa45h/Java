import java.util.*;

public class VarArgs
{

static int sum(int ...a)
{
int s=0;

for(int x : a)
{
s+=x;
}
return s;
}

public static void main(String[]args)
{

System.out.println("\nSum : "+sum(10,20));
System.out.println("\nSum : "+sum(10,20,30));
System.out.println("\nSum : "+sum(10,20,30,40));
System.out.println("\nSum : "+sum(10,20,30,40,50));
System.out.println("\nSum : "+sum(10,20,30,40,50,60));

}
}