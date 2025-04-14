// wap to create dbms where there are 3 users all users can read data at a time but only one user can edit the data at a time.

class CallDb 
{
	void read(String name)
	{
		System.out.print("\n\n "+name+" IS READING THE DATA!");
		try 
		{
			Thread.sleep(3000);
		}
		catch(Exception e) {}
	}
	
	synchronized void write(String name)
	{
		System.out.print("\n\n\t "+name+" IS WRITING THE DATA!");
		try 
		{
			Thread.sleep(3000);
		}
		catch(Exception e) {}
	}
}

class DbmsChild implements Runnable 
{
	Thread th;
	String name;
	CallDb c;
	
	DbmsChild(String name, CallDb c)
	{
		this.name=name;
		this.c=c;
		th = new Thread(this);
		th.start();
	}
	
	public void run()
	{
		c.read(name);
		c.write(name);
	}
}

public class MySyncDbms {

	public static void main(String[] args) {
		
		CallDb c = new CallDb();
		
		DbmsChild dc1 = new DbmsChild("Aman",c);

		DbmsChild dc2 = new DbmsChild("Baman",c);

		DbmsChild dc3 = new DbmsChild("Chaman",c);
}

}
