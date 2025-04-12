import java.util.*;

class NegativeAmountException extends Exception
{
	double amt;
	
	NegativeAmountException(double amt)
	{
		this.amt=amt;
	}
	
	public String toString()
	{
		return "Negative amount not axceptable!";
	}
	
}
public class CustomException {

	public static void main(String[] args) 
	{
		double amt;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nEnter amt: ");
		amt = sc.nextInt();
		
		try
		{
			if(amt<0)
			{
				throw new NegativeAmountException(amt);
			}
			else
			{
				System.out.println("\nEnjoy!");
			}
		}
		catch(NegativeAmountException ne)
		{
			System.out.println(ne);
		}
	}

}
