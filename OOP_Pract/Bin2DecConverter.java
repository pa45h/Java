import java.util.*;

public class Bin2DecConverter {
    public static void main(String[] args) 
    {
        System.out.println("\n Name: Parth Katariya \n Enrollment No: 230410107073\n\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary string: ");
        String binaryString = sc.nextLine();
        
        try 
        {
            int decimal = bin2Dec(binaryString);
            System.out.println("Decimal: " + decimal);
        } 
        catch (NumberFormatException e) 
        {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public static int bin2Dec(String binaryString) 
    {
        int decimal = 0;
        for (int i = 0; i < binaryString.length(); i++) 
        {
            char ch = binaryString.charAt(i);
            
            if (ch != '0' && ch != '1')
                throw new NumberFormatException("Not a binary string");
            
            decimal = decimal * 2 + (ch - '0');
        }
        return decimal;
    }
}
