import java.util.*;

public class Tax
{
public static void main(String[]args)
{
double sal,tax;
Scanner sc=new Scanner(System.in);

System.out.print("\nEnter your salary: ");
sal=sc.nextDouble();

tax=(sal>=100000)?sal*0.20:sal*0.10;

System.out.println("\nYour tax = "+tax);

}
}