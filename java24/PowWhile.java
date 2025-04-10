import java.util.*;

public class PowWhile
{
public static void main(String[]args)
{

int b,p;
int ans=1;
int i=1;

Scanner sc=new Scanner(System.in);

System.out.println("\nEnter base:");
b=sc.nextInt();
System.out.println("\nEnter power:");
p=sc.nextInt();


while(i<=p)
{
ans*=b;
i++;
}
System.out.println(+p+" to the base "+b+" = "+ans);
}
}