// WAP enter char and check whether it is vowel or consonent.

import java.util.*;

public class VowCon
{
public static void main(String[]args)
{

char c;
Scanner s=new Scanner(System.in);
String msg="";

System.out.println("\nEnter a charecter: ");
c=s.next().charAt(0);

msg=(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'||c=='a'||c=='e'||c=='i'||c=='o'||c=='u') ? "Vowel" : "Consonent";

System.out.println(msg);
}
} 