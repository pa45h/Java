// wap to enter string and count upper and lower char.

import java.util.*;

public class LowUpChar
{
	public static void main(String[]args)
	{

	String s;
	int Lc=0;
	int Uc=0;
	Scanner sc=new Scanner(System.in);

	System.out.println("\nEnter a String: ");
	s=sc.nextLine();

	for(int i=0;i<s.length();i++)
	{
 		char c=s.charAt(i);

		if(c>=97 && c<=122)
		{
		Lc++;
		}

		if(c>=65 && c<=90)
		{
		Uc++;
		}

	}	

	System.out.println("\nLowerCase Chars = "+Lc+"\nUpperCase Chars = "+Uc);

	}
}












