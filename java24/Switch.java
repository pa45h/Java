import java.util.*;

public class Switch
{
public static void main(String[]args)
{
String Clg;
Scanner s=new Scanner(System.in);

System.out.println("\nEnter college name: ");
Clg=s.next();

switch(Clg)
{
case "SVIT" : 	System.out.println("\nVASAD"); break;

case "MSU" : 	System.out.println("\nVADODARA"); break;

default : 	System.out.println("\nWrite MSU or SVIT"); break;


}
}
}