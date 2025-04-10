import java.util.*;

public class ArrChngPosNeg
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
}

for(int i=0;i<arr.length;i++)
{
arr[i]*=(-1);
System.out.print(" "+arr[i]);
}

}
}