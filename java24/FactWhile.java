import java.util.*;

public class FactWhile
{
public static void main(String[]args)
{
int n,i=1,fact=1;
Scanner s=new Scanner(System.in);

System.out.println("Enter n: ");
n=s.nextInt();

while(i<=n)
{
fact*=i;
i++;
}

System.out.println(+n+"! = "+fact);

}
}