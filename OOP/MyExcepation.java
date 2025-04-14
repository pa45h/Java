// wap to enter 2 no and divide 1st no by 2nd no

import java.util.*;

public class MyExcepation {

	public static void main(String[] args) 
	{
		int a=0,b=0,c=0;
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		
		try
		{
			c=a/b;
		}
		catch(ArithmeticException ae)
		{
			System.out.println("\n ERROR: "+ae.getMessage());
		}
		
		System.out.println(""+a+"/"+b+" = "+c);
	}

}
