
class Child4 implements Runnable
{
	Thread th;
	char st,end;
	
	Child4(char st, char end)
	{ 
		th = new Thread(this);
		this.st=st;
		this.end=end;
		th.start();
	}
	
	public void run()
	{
		System.out.println("\n\nFrom "+st+" to "+end+" : ");
		for(char i=st;i<=end;i++)
		{
			System.out.println(" "+i);
			try
			{
				Thread.sleep(250);
			}
			catch(Exception e) {}
		}
	}
}

public class ChildTh4 {

	public static void main(String[] args) 
	{
		Thread th = Thread.currentThread();
		Child4 c1 = new Child4('a','z');
		try {c1.th.join();}
		catch(Exception e) {}
		Child4 c2 = new Child4('A','Z');
	}

}
