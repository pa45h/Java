import java.util.*;

class FactPow implements Runnable
{
	Thread th;
	int n,a,b;
	boolean flag;
	
	FactPow(int n)
	{
		th = new Thread(this);
		this.n=n;
		flag = true; 
		th.start();
	}
	
	FactPow(int a, int b)
	{
		th = new Thread(this);
		this.a=a;
		this.b=b;
		flag = false;
		th.start();
	}
	
	public void run()
	{
		if(flag == true)
		System.out.print("\n\n "+n+"! = "+factorial(n));
		else
		System.out.print("\n\n "+a+"^"+b+" = "+power(a,b));
	}
	
	int factorial(int n)
	{
		int fact=1;
		
		for(int i=1;i<=n;i++)
		{
			fact*=i;
		}
		return fact;
	}
	
	int power(int a, int b)
	{
		int pow=1;
		
		for(int i=1;i<=b;i++)
		{
			pow*=a;
		}
		return pow;
	}
	
}

public class FactPowTh {

	public static void main(String[] args) {
		int n,a,b;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter no for Factorial: ");
		n=sc.nextInt();
		System.out.print("Enter a (a^b): ");
		a=sc.nextInt();
		System.out.print("Enter b (a^b): ");
		b=sc.nextInt();
		
		FactPow fp1 = new FactPow(n);
		FactPow fp2 = new FactPow(a,b);
	}

}
