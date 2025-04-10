import java.util.*;

public class WhilePow
{
public static void main(String[]args)
{
int n,i=1,r;
Scanner sc=new Scanner(System.in);

System.out.print("\nBase:");
n=sc.nextInt();
System.out.print("\nPower:");
r=sc.nextInt();
int p=n;

while(i<r)
{
p*=n;
i++;
}
System.out.print(p);
}
}