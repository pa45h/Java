import java.util.Scanner;

public class BMICalculator {
	
    public static void main(String[] args) 
    {
        System.out.println("\n Name: Parth Katariya \n Enrollment No: 230410107073\n\n");
     
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your weight in pounds: ");
        double pounds = sc.nextDouble();
        
        System.out.print("Enter your height in inches: ");
        double inches = sc.nextDouble();
        
        double kg = pounds * 0.45359237;
        double meters = inches * 0.0254;
        double bmi = kg / (meters * meters);
        
        System.out.println("BMI: " + bmi);
    }
}
