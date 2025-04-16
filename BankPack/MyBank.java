import bank.*;
import atm.*;

class Customer extends Bank implements Atm
{
	int cid;
	String name;
	double bal;
	
	Customer(String bname, String area, int cid, String name, double bal)
	{
		super(bname,area);
		this.cid=cid;
		this.name=name;
		this.bal=bal;
	}
	
	void display()
	{
		super.show();
		System.out.println("\nCostomer Id = "+cid);
		System.out.println("\nCostomer Name = "+name);
		System.out.println("\nCostomer balance = "+bal);
	}
	public void wid()
	{
		System.out.println("\nMax-Wid = "+maxWid);
	}
}

public class MyBank {

	public static void main(String[] args) 
	{
		Customer c1 = new Customer("bob","sama",101,"Parth",200000);
		c1.display();
	}

}
