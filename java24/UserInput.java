import java.util.*;

public class UserInput
{
public static void main(String[] args)
{

int no;
String name;
float height;
double sal;

Scanner scan = new Scanner(System.in);

System.out.println("\nEnter your no. : ");
no=scan.nextInt();

System.out.println("\nEnter your name: ");
name=scan.next();

System.out.println("\nEnter your height: ");
height=scan.nextFloat();

System.out.println("\nEnter your salary: ");
sal=scan.nextDouble();

System.out.println("\nno. : "+no);
System.out.println("\nname: "+name);
System.out.println("\nheight: "+height);
System.out.println("\nsalary: "+sal);




}
}