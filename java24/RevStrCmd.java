// wap to reverse string pass through commant line argument:

public class RevStrCmd
{
public static void main(String[]args)
{

String s=args[0];

StringBuffer sb=new StringBuffer(s);
s=""+sb.reverse();
System.out.println("\n"+s);

}
}