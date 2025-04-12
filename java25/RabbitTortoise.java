//wap to implement a story of rabbit and tortoise where they have to race for 10 miles. 
//@3rd mile tunnel will come from where only one can go through. 
//@5th mile rabbit will sleep when story reaches to 7th mile rabbit will wake up and start running. 
//and print who won the race.

class Track
{
	synchronized void tunnel(String rna,long sl)
	{
		System.out.print("\n "+rna+" has entered into the tunnel!");
		
		try {Thread.sleep(sl);}
		catch(Exception e) {}
		
		System.out.print("\n\t "+rna+" has crossed the tunnel!");
	}
	
	synchronized void slept()
	{
		System.out.print("\n\n Rabbit has Slept!");
		
		try {wait();}
		catch(Exception e) {}
		
		System.out.print("\n\n rabbit woke up and Ran!");
	}
	
	synchronized void awake()
	{
		notify();
	}
}

class Racer implements Runnable
{
	Thread th;
	long sl;
	Track tr;
	String rna;
	int miles;

	Racer(String rna, long sl, Track tr)
	{
		th=new Thread(this);
		this.sl=sl;
		this.tr=tr;
		this.rna=rna;
		miles=0;
		th.start();
	}
	
	public void run()
	{
		while(miles<=10)
		{
			try {Thread.sleep(sl);}
			catch(Exception e) {}
			
			miles++;
			
			if(miles==10)
			{
				System.out.print("\n\n "+rna+" has WON!");
				System.exit(0);
			}
			System.out.print("\n\n "+rna+" has reached "+miles+"!");
			if(miles==3)
			{
				tr.tunnel(rna, sl);
			}
			else if(miles==5 && rna.equals("Rabbit"))
			{
				tr.slept();
			}
			else if(miles==7 && rna.equals("Tortoise"))
			{
				tr.awake();
			}
		}
	}
}

public class RabbitTortoise {

	public static void main(String[] args) 
	{
		Track tr = new Track();
		Racer r = new Racer("Rabbit",2000,tr);
		Racer t = new Racer("Tortoise",3000,tr);
	}

}
