package bank;

public class Bank 
{
	public String bname,area;
	
	public Bank(String bname, String area)
	{
		this.bname=bname;
		this.area=area;
	}
	
	public void show()
	{
		System.out.println("\nBank Name = "+bname);
		System.out.println("\nBank Area = "+area);
	}
}
