import java.util.*;

public class OddEven
{
public static void main(String[]args)
{
int n;
Scanner sc=new Scanner(System.in);

System.out.print("\nEnter a no.: ");
n=sc.nextInt();

String msg=(n%2==0)?"\nEVEN":"\nODD";
System.out.println(msg);

}
}