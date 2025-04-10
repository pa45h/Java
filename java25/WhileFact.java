import java.util.*;

public class WhileFact
{
public static void main(String[]args)
{
int n,i=1,f=1;
Scanner sc=new Scanner(System.in);

System.out.print("\nEnter No.:");
n=sc.nextInt();

while(i<=n)
{
f*=i;
i++;
}
System.out.print(f);
}
}