import java.util.*;

public class ArrPosNeg
{
public static void main(String[]args)
{

int pos=0,neg=0;
int arr[]=new int[10];
Scanner sc=new Scanner(System.in);

for(int i=0;i<arr.length;i++)
{
System.out.print("Enter arr["+i+"] : ");
arr[i]=sc.nextInt();

if(arr[i]>=0)	pos++;

else		neg++;
}

System.out.println("\n\nArray: ");
for(int x:arr)
{
System.out.print(" "+x);
}

System.out.println("\nPOSITIVE ELEMENTS= "+pos);
System.out.println("\nNEGATIVE ELEMENTS= "+neg);

}
}