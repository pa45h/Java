import java.util.*;

public class TableWhile
{
public static void main(String[]args)
{
int n,i=1;
Scanner s=new Scanner(System.in);

System.out.println("Enter n: ");
n=s.nextInt();

while(i<=10)
{
System.out.println(+n+" * "+i+" = "+(n*i));
i++;
}

}
}