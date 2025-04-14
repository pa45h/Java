
class Bank1
{
	String bName;
	String area;
	
	Bank1(String bName, String area)
	{
		this.bName=bName;
		this.area=area;
	}
	
	void show()
	{
		System.out.print("\n\nBank Name = "+bName);
		System.out.print("\n\nBank Area Name = "+area);
	}
}

interface Atm
{
	int maxWid=20000;
	void atShow();
}

class Customer extends Bank1 implements Atm
{

	int cId;
	String cName;
	double bal;
	
	Customer(String bName, String area, int cId, String cName, double bal)
	{
		super(bName,area);
		
		this.cId=cId;
		this.cName=cName;
		this.bal=bal;
	}
	
	void display()
	{
		super.show();
		atShow();
		System.out.println("\n\nCustomer Id = "+cId);
		System.out.println("\n\nCustomer Name = "+cName);
		System.out.println("\n\nBalance = "+bal);
	}
	
	public void atShow()
	{
		System.out.println("\n\nMax-Wid = "+maxWid);
	}
	
	
}

public class BankInterface {

	public static void main(String[] args) 
	{
		Customer c1 = new Customer("BoB","Sama",101,"Jethalal",250000);
		c1.display();
	}

}
