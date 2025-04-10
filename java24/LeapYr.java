import java.util.*;

public class LeapYr
{
public static void main(String[]args)
{

int yr;
String msg;

Scanner s=new Scanner(System.in);

System.out.println("\nEnter the year: ");
yr=s.nextInt();

msg= ((yr%4==0 && yr%100!=0) || yr%400==0) ? "\n\nLeap Year" : "\n\nNot A Leap Year" ;
System.out.println(msg);
}
}