public class MyFor7
{
public static void main(String[]args)
{

int m=1;

for(int i=1;i<=5;i++)
{
	for(int j=i;j<=5;j++)
	{
	System.out.print(" ");
	}
	for(int j=1;j<=m;j++)
	{
	System.out.print("*");
	}
	
System.out.print("\n");
m+=2;
}

}
}

/*

     *
    ***
   *****
  *******
 *********

*/