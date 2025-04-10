import java.util.*;

public class ResultLadder
{
public static void main(String[]args)
{

double m1,m2,m3;
double per;
Scanner sc= new Scanner(System.in);

System.out.print("Enter Marks of 3 sub: ");
m1=sc.nextDouble();
m2=sc.nextDouble();
m3=sc.nextDouble();

per=(m1+m2+m3)/3;

if(per>=85)
{
System.out.print("A Grade!");
}
else if(per<85 && per>=75)
{
System.out.print("B Grade!");
}
else if(per>=65 && per<75)
{
System.out.print("C Grade!");
}
else if(per<65 && per>=55)
{
System.out.print("D Grade!");
}
else if(per<55 && per>=45)
{
System.out.print("E Grade!");
}
else if(per<45)
{
System.out.print("FAIL!");
}

}
}