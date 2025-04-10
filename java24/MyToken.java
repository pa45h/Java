import java.util.*;

public class MyToken
{
public static void main(String[]args)
{

String s="TODAY IS A GOOD DAY. KING IS TALKING WITH SOMEONE. YAKSH IS REGULAR ON CLASS. DEVANSHU IS OFTEN CALLED VENU.";

StringTokenizer st1=new StringTokenizer(s);				// brakes the string by spaces

System.out.print("\nNo of tokens: "+st1.countTokens());		

StringTokenizer st2=new StringTokenizer(s,".I");			// brakes by . or I both

System.out.print("\nNo of tokens: "+st2.countTokens());		

System.out.println("\n\nS broken by space: \n");

while(st1.hasMoreTokens())
{
String token=st1.nextToken();
System.out.print("\n"+token);
}

System.out.println("\n\nS broken by . or I both: \n");

while(st2.hasMoreTokens())
{
String token=st2.nextToken();
System.out.print("\n"+token);
}


System.out.print("\n\nNo of tokens remaining in st1: "+st1.countTokens());
System.out.print("\nNo of tokens remaining in st2: "+st2.countTokens());		
		
}
}