import java.util.*;

public class Grade
{
public static void main(String[]args)
{

int m1,m2,m3,p;
Scanner sc=new Scanner(System.in);

System.out.println("\nPhysics Marks: ");
m1=sc.nextInt();
System.out.println("\nMaths Marks: ");
m2=sc.nextInt();
System.out.println("\nChemistry Marks: ");
m3=sc.nextInt();

p=(m1+m2+m3)/3;

if(p>=75)
{
System.out.println("\nA");
}
else if(p<75 && p>=65)
{
System.out.println("\nB");
}
else if(p<65 && p>=55)
{
System.out.println("\nC");
}
else if(p<55 && p>=35)
{
System.out.println("\nD");
}
else
{
System.out.println("\nFAIL");
}

}
}