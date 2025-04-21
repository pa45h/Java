import java.util.Scanner;

public class MeterToFeet {
    public static void main(String[] args) 
    {
    	System.out.println("\n Name: Parth Katariya \n Enrollment No: 230410107073\n\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter meters: ");
        double meters = sc.nextDouble();
        double feet = meters * 3.28084;
        System.out.println("Feet: " + feet);
    }
}