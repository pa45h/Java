import java.util.*;

public class MxMnArr
{
public static void main(String[]args)
{

int arr[] = new int[10];
Scanner in = new Scanner(System.in);

int max,min;
for(int i=0;i<10;i++)
{
System.out.print("\nEnter arr["+i+"] : ");
arr[i] = in.nextInt();
}

max=min=arr[0];

for(int n : arr)
{
if(n<min)
{
min=n;
}
else if(n>max)
{
max=n;
}
}

System.out.print("\nMax = "+max+"\nMin = "+min);

}
}