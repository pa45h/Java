public class SumClaN
{
public static void main(String[]args)
{

int s = 0;

for(int i=0;i<args.length;i++)
{
s+=Integer.parseInt(args[i]);
}

System.out.println("\nSum of N = "+s);

}
}