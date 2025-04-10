// wap to find factorial for a given no from cmf line.

public class FactCmd
{
public static void main(String[]args)
{

int n=Integer.parseInt(args[0]);
int fact=1;

for(int i=1;i<=n;i++)
{
fact*=i;  
}

System.out.println("\n"+n+"! = "+fact);

}
}