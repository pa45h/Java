public class MyFor5
{
public static void main(String[]args)
{
for(int i=1;i<=5;i++)
{
	for(int j=i;j<=5;j++)
	{
	System.out.print(" ");
	}
	for(int j=1;j<=i;j++)
	{
	System.out.print("*");
	}
	
System.out.print("\n");
}

}
}

/*

     *
    **
   ***
  ****
 *****

*/

/*
OR 

public class Try
{
public static void main(String[]args)
{
for(int i=1;i<=5;i++)
{
	for(int j=1;j<=5;j++)
	{
		if(j>=(6-i))
		{		
		System.out.print("*");
		}
		else
		{		
		System.out.print(" ");
		}
	}
	
System.out.print("\n");
}

}
*/