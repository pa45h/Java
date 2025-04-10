// wap to enter a string and also enter a char and count all occurrence of given char in a string.

import java.util.*;	

public class Occurrence
{
public static void main(String[]args)
{

String s1;
char ch;
int count=0;
Scanner sc=new Scanner(System.in);

System.out.println("Enter a String: ");
s1=sc.next();

System.out.println("Enter a Char: ");
ch=sc.next().charAt(0);

for(int i=0;i<s1.length();i++)
{
char c=s1.charAt(i);
if(c==ch)
{
count++;
}
}
System.out.println("Occurrence of "+ch+" in "+s1+" = "+count);

}
}