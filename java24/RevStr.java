// wap to reverse a string

import java.util.*;

public class RevStr
{
public static void main(String[]args)
{

String s1;
String s2="";
Scanner sc=new Scanner(System.in);

System.out.print("\nEnter a String: ");
s1=sc.next();

for(int i=s1.length()-1;i>=0;i--)
{
s2+=s1.charAt(i);
}

System.out.println("\nReversed Str = "+s2);

}
}