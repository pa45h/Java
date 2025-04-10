import java.util.*;

public class PassFail
{
public static void main(String[]args)
{

int m;
String msg;

Scanner s=new Scanner(System.in);

System.out.println("\nEnter your marks: ");
m=s.nextInt();

msg= (m>=36) ? "\n\nPASS" : "\n\nFAIL" ;
System.out.println(msg);
}
}