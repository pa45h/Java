// WAP to find +ve or -ve.

import java.util.*;

public class PosNeg
{
public static void main(String[]args)
{
int no;
String msg="";
Scanner s=new Scanner(System.in);

System.out.println("\nEnter a no.: ");
no=s.nextInt();

msg = (no>=0) ? " Positive" : " Negative";

System.out.println(msg);

}
}