// WAP to convert C to F.

import java.util.*;

public class CtoF
{
public static void main(String[]args)
{
float c,f;
Scanner s=new Scanner(System.in);

System.out.println("\nEnter temp in Celsius: ");
c=s.nextFloat();

f=(c*1.8f)+32;

System.out.println("\n"+c+" C = "+f+" F ");
}
}
