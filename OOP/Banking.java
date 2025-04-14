//wap to create class bank which contains id, name, opening bal, deposit,
//withdrawal, closing bal and charges. create menu driven program and perform 
//different operations as per client request.

import java.util.*;

class Bank
{
	int cId;
	String cName;
	double opBal, depo, with, clBal, chrgs;
	Scanner scan = new Scanner(System.in);
	
	Bank(int cId, String cName)
	{
		this.cId=cId;
		this.cName=cName;
		opBal=0;
		
		while(opBal<1000)
		{
			System.out.print("\nENTER OPENEING BALANCE(>1000/-) : ");
			opBal=scan.nextDouble();
		}
		System.out.print("\n"+cName+", YOUR A/C HAS BEEN CREATED...");
		
		depo=0;
		with=0;
		clBal=opBal;
		chrgs=0;
	}
	
	void passBook()
	{
		System.out.print("\n\nBANK OF BARODA \n");
		System.out.print("\nId = "+cId);
		System.out.print("\nName = "+cName);
		System.out.print("\nOPENING BALANCE = "+opBal);
		System.out.print("\nDEPOSIT = "+depo);
		System.out.print("\nWITHDRAWAL = "+with);
		System.out.print("\nCHARGES = "+chrgs);
		System.out.print("\nCLOSING BALANCE = "+clBal);
	}
	
	void deposite()
	{
		double d;
		System.out.print("\nENTER DEPOSIT : ");
		d=scan.nextDouble();

		depo += d;
		clBal += d;
	}
	
	void withdrawal()
	{
		double w;
		System.out.print("\nENTER AMOUNT TO WITHDRAW : ");
		w=scan.nextDouble();
		
		if(w>clBal)
		{
			System.out.print("\nINSUFFICIENT BALANCE!");
		}
		else if(w>(clBal-1000))
		{
			System.out.print("\n BALANCE BELOW 1000/- \n(CHARGABLE) DO YOU WANT TO CONTINUE ?(Y/N)");
			char c = scan.next().charAt(0);
			
			if(c=='Y' || c=='y')
			{
				with+=w;
				chrgs+=100;
				clBal-=w+100;
			}
		}
		else
		{
			with+=w;
			clBal-=w;
		}
	}
}

public class Banking {

	public static void main(String[] args) 
	{
		Bank b1 = new Bank(101,"Parth");
		int choise=0;
		Scanner scan = new Scanner(System.in);
		
		while(choise!=4)
		{
			System.out.print("\n\nBANK OF BARODA \n 1. DEPOSIT\n 2. WITHDRAWAL\n 3. PASSBOOK\n 4.EXIT\n\n SELECT YOUR CHOISE: ");
			choise=scan.nextInt();
			
			switch(choise)
			{
			case 1: b1.deposite();
				break;
			case 2: b1.withdrawal();
				break;
			case 3: b1.passBook();
			}
		}

	}

}
