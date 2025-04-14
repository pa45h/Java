
class Child2 implements Runnable
{
	Thread th;
	String name;
	
	Child2(String name)
	{
		th = new Thread(this);
		this.name=name;
		th.start();
	}
	
	public void run()
	{
		for(int i=10;i>=1;i--)
		{
			System.out.println("\t"+name+" :- "+i);
			try 
			{
				Thread.sleep(500);
			}
			catch(Exception e) {}
		}
	}
}

public class ChildTh2 {

	public static void main(String[] args) {
		Thread th = Thread.currentThread();
		Child2 ch1 = new Child2("1st child");
		Child2 ch2 = new Child2("2nd child");	
		
		System.out.println("\nChild ch1: "+ch1.th.isAlive());
		System.out.println("Child ch2: "+ch2.th.isAlive());
		System.out.println("Main : "+th.isAlive());
		
		for(int i=1;i<=10;i++)
		{
			System.out.println("Main :- "+i);
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e) {}
		}
		
		System.out.println("\nChild ch1: "+ch1.th.isAlive());
		System.out.println("Child ch2: "+ch2.th.isAlive());
		System.out.println("Main : "+th.isAlive());
	}

}
