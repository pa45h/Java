
public class MainThread {

	public static void main(String[] args) 
	{
		Thread t = Thread.currentThread();
		System.out.println("\nName : "+t.getName());
		t.setName("Mine Thread");
		System.out.println("Name : "+t.getName());
		
		System.out.println("\nPriority : "+t.getPriority());


		for(int i=0; i<10;i++)
		{
			System.out.println("Main Thread: "+(i+1));
			try {Thread.sleep(1000);} catch (Exception e) {	}
		}
	}
}
