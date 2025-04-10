import java.util.*;

public class OddEven
{
public static void main(String[]args)
{

int no;
String msg;
Scanner s=new Scanner(System.in);

System.out.println("\nEnter a no.: ");
no=s.nextInt();

msg = (no%2==0) ? " Even" : " Odd";

System.out.println("\n"+msg);

}
}