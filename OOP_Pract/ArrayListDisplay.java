import java.util.ArrayList;
import java.util.Date;

class Loan 
{
	public String toString() 
	{
		return "Loan Object";
	}
}
class Circle 
{
	public String toString() 
	{
		return "Circle Object";
	}
}

public class ArrayListDisplay {
    public static void main(String[] args) 
    {
        System.out.println("\n Name: Parth Katariya \n Enrollment No: 230410107073\n\n");
        
        ArrayList list = new ArrayList();
        
        Loan loanObj = new Loan();
        Date dateObj = new Date();
        String message = "This is a String";
        Circle circleObj = new Circle();
        
        list.add(loanObj);
        list.add(dateObj);
        list.add(message);
        list.add(circleObj);
        
        System.out.println("Displaying elements using toString():");
        
        for(Object obj : list) 
        {
            System.out.println(obj.toString());
        }
    }
}
