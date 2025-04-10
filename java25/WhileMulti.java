import java.util.*;

public class WhileMulti
{
public static void main(String[]args)
{
int n,i=1;
Scanner sc=new Scanner(System.in);

System.out.print("\nNo.:");
n=sc.nextInt();

while(i<=10)
{
System.out.println(""+(i*n));
i++;
}
}
}