// wap to enter a no and print tables till that no.

import java.util.*;

class MultiTable implements Runnable
{
	Thread th;
	int n;
	
	MultiTable(int n)
	{	
		th = new Thread(this);
		this.n=n;
		th.start();
	}
	
	public void run()
	{
		for(int j=1;j<=n;j++)
		{			
			for(int i=1;i<=10;i++)
			{
				System.out.println(" "+j+" * "+i+" = "+(j*i));
				try {
					th.sleep(250);
				} catch(Exception e) {}
			}
			System.out.println();
		}
	}
	
	
}

public class MultiTableTh {

	public static void main(String[] args) {
		
		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a no. : ");
		n=sc.nextInt();
		
		MultiTable mt = new MultiTable(n);

	}

}
