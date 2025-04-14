// Create a BankAccount class with attributes accountHolderName, accountBalance, and methods to deposit and withdraw money. Ensure that the balance never goes below zero.

import java.util.*;

class Acc
{
	String accountHolderName;
	double accountBalance;
	
	void getData()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\n\nEnter your Name : ");
		accountHolderName=sc.nextLine();
		System.out.print("\nEnter your Balance : ");
		accountBalance=sc.nextDouble();
		
	}
	
	void deposit(double amt)
	{
		accountBalance+=amt;
	}
	
	void withdraw(double amt)
	{
		if (accountBalance >= amt) 
		{
            accountBalance -= amt;
        } 
		else 
        {
            System.out.println("\nInsufficient balance! Withdrawal not possible.");
        }
	}
	
	void getBalance()
	{
		System.out.print("\n\nBalance of "+accountHolderName+" = "+accountBalance);
	}
}

public class MyBank {

	public static void main(String[] args) 
	{
		char c;
		double amt;
		Acc a1 = new Acc();
		
		a1.getData();
		
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("\n\nEnter Choice (w for withraw / d for deposit) : ");
		c=in.next().charAt(0);
		in.nextLine();
		System.out.print("\nEnter Amount : ");
		amt=in.nextDouble();
		
		
		switch(Character.toUpperCase(c))
		{
		case 'W':
			a1.withdraw(amt);
			break;
		case 'D':
			a1.deposit(amt);
			break;
		default:
			System.out.print("\n\nEnter valid Choice!!");
			break;
		}
		
		a1.getBalance();

	}

}
