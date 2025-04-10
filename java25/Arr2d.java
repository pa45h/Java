import java.util.*;

public class Arr2d
{
public static void main(String[]args)
{

Scanner in = new Scanner(System.in);
int m,n;

System.out.print("\nEnter M: ");
m=in.nextInt();
System.out.print("\nEnter N: ");
n=in.nextInt();

int arr[][] = new int[m][n];

for(int i=0;i<arr.length;i++)
{
	for(int j=0;j<arr[i].length;j++)
	{
	System.out.print("arr["+i+"]["+j+"] : ");
	arr[i][j] = in.nextInt();
	}
}

System.out.print("\n\nMatrix of M cross N: \n");

for(int x[]:arr)
{
	for(int y:x)
	{
	System.out.print(" "+y);
	}
System.out.print("\n");
}

}
}