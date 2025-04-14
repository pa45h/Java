import java.util.*;

class InvalidMarksException extends Exception
{
	double marks;
	
	InvalidMarksException(double marks)
	{
		this.marks=marks;
	}
	
	public String toString()
	{
		return "\n\nMarks cannot be less than 0 and more than 100 !";
	}
}

public class MarksException {

	public static void main(String[] args) 
	{
		double marks;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\n\nEnter marks: ");
		marks=sc.nextDouble();
		
		try
		{
			if(marks<0 || marks>100)
			{
				throw new InvalidMarksException(marks);
			}
			else
			{
				System.out.println("\ndone!");
			}
		}
		catch(InvalidMarksException ie)
		{
			System.out.println(ie);
		}
	}

}
