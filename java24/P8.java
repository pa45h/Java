/*
     *
    ***
   *****
  *******
 *********
*/

public class P8
{
public static void main(String[] args)
{

for(int i=0;i<=5;i++)
{
for(int j=0;j<=10;j++)
{
if(j>=(6-i) && j<=(4+i))
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
}

/*
for(int i=1;i<=5;i++)
{
	for(int j=i;j<=5;j++)
	{
	System.out.print(" ");
	}

	for(int j=1;j<=2*i-1;j++)
	{
	System.out.print("*");
	}

 	
System.out.print("\n");
}
*/