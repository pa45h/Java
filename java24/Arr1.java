import java.util.*;

public class Arr1
{
public static void main(String[]args)
{

int n,i,s=0;

Scanner sc=new Scanner(System.in);

System.out.print("\nEnter elements of array: ");
n=sc.nextInt();

int arr[]=new int [n];

for(i=0;i<arr.length;i++)
{
System.out.print("arr["+i+"] : ");
arr[i]=sc.nextInt();
}

/*
for(i=0;i<arr.length;i++)
{
System.out.print(" "+arr[i]);
s+=arr[i];
}
*/

// for-each loop
// can be used to read val from array, cant insert
// can not used to change val of array element

for(int x : arr)
{
System.out.print(" "+x);
s+=x;
}
System.out.print("\n SUM = "+s);

}
}