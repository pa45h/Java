import java.util.*;

public class SortArr
{
public static void main(String[]args)
{

int arr[] = new int[10];
Scanner in = new Scanner(System.in);

for(int i=0;i<arr.length;i++)
{
System.out.print("\nEnter arr["+i+"] : ");
arr[i] = in.nextInt();
}

for(int i=0; i<arr.length; i++)
{
	for(int j=i+1; j<arr.length; j++)
	{
		if(arr[i]>arr[j])
		{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		}
	}
}

for(int n : arr)
{
System.out.print(" "+n);
}

/*
for(int i=0;i<arr.length;i++)
{
System.out.print(" "+arr[i]);
}
*/
}
}