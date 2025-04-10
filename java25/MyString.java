import java.util.*;

public class MyString
{
public static void main(String[]args)
{

String s1 = "Hello java! I am parth katariya! Learning java..";

StringTokenizer st = new StringTokenizer(s1);

System.out.println("\nTokens :"+st.countTokens());

while(st.hasMoreTokens())
{
System.out.println(""+st.nextToken());
}

System.out.println("\nTokens : "+st.countTokens());

}
}