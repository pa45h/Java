
class Child3 extends Thread
{
	int st,end;
	
	Child3(int st, int end)
	{ 
		this.st=st;
		this.end=end;
		show();
	}
	
	public void show()
	{
		System.out.println("\n\nFrom "+st+" to "+end+" : ");
		for(int i=st;i<=end;i++)
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

public class ChildTh3 {

	public static void main(String[] args) 
	{
		Child3 c1 = new Child3(1,10);
		Child3 c2 = new Child3(11,20);
		Child3 c3 = new Child3(21,30);
	}

}
