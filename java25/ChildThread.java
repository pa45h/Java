// wap to create 2 thread, main thread will print 1 to 10 and child thread will print 10 to 1.

class Child extends Thread
{
	Child()
	{
//		show();
		start();	// used to call run();
	}
	
//	void show()
	
	public void run()	// used for multithreading
	{					// (allows main and child thread to run together)
		for(int i=10;i>=1;i--)
		{
			System.out.println("\n\tChild :- "+i);
			try 
			{
				Thread.sleep(500);
			}
			catch(Exception e) {}
		}
	}
}

public class ChildThread 
{

	public static void main(String[] args) 
	{
		Thread th = Thread.currentThread();
		Child ch1 = new Child();
		Child ch2 = new Child();
		
		for(int i=1;i<=10;i++)
		{
			System.out.println("\n Main :- "+i);
			try 
			{
				Thread.sleep(500);
			}
			catch(Exception e) {}
		}
	}

}
