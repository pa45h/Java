public class MaxClaN
{
public static void main(String[]args)
{

int m = Integer.parseInt(args[0]);

for(int i=0;i<args.length;i++)
{

if(Integer.parseInt(args[i])>m)
m=Integer.parseInt(args[i]);

}

System.out.println("\nMax from N = "+m);

}
}