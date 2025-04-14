
class Call 
{
	void Movie(String name)
	{
		System.out.print("\n\n "+name+" is watching Movie!");
		try 
		{
			Thread.sleep(3000);
		}
		catch(Exception e) {}
		System.out.print("\n\n\t "+name+" has finished Movie!");
	}
	
	synchronized void Interview(String name)
	{
		System.out.print("\n\n "+name+" is giving interview!");
		try 
		{
			Thread.sleep(3000);
		}
		catch(Exception e) {}
		System.out.print("\n\n\t "+name+" has finished interview!");
	}
}

class SyncChild implements Runnable
{
	Thread th;
	String name;
	Call c;
	
	SyncChild(String name, Call c)
	{
		th = new Thread(this);
		this.c=c;
		this.name=name;
		th.start();
	}
	
	public void run()
	{
		c.Movie(name);
		c.Interview(name);
	}
}

public class MySync {

	public static void main(String[] args) {

		Call c = new Call();
		SyncChild sc1 = new SyncChild("Marmik",c);
		SyncChild sc2 = new SyncChild("Khush",c);
		SyncChild sc3 = new SyncChild("Vraj",c);
	}

}
