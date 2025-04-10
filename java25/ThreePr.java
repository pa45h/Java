import java.lang.*;
import java.util.*;

public class ThreePr
{

public static void main(String[]args)
{

Scanner s= new Scanner(System.in);
double a,b,c;

System.out.print("\nEnter three no: ");
a=s.nextDouble();
b=s.nextDouble();
c=s.nextDouble();

double sum = a+b+c;

System.out.println("\nSum= "+sum);
System.out.println("\nPercentage = "+(sum/3));

}
}