// wap to find power for nos passed through cmd line argument.

public class PowCmd
{
public static void main(String[]args)
{

int x=Integer.parseInt(args[0]);
int n=Integer.parseInt(args[1]);
int p=1;

for(int i=1;i<=n;i++)
{
p*=x;
}

System.out.println("\n"+x+"^"+n+" = "+p);

}
}