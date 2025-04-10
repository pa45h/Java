import java.util.*;

public class PrimeWhile
{
	public static void main(String[]args)
	{
		int n,i=2,flag=0;
		Scanner s=new Scanner(System.in);

		System.out.println("Enter n: ");
		n=s.nextInt();
		
		if(n<2)
		{  
			flag=1;
		}
		else
		{
			while(i<n)
			{
				if(n%i==0)
				{		
					flag=1;
					break;
				}
			i++;
			}
		}

	if(flag==1)
	{
		System.out.println("Not A Prime");
	}
	else
	{
		System.out.println("Prime");
	}

	}	
}