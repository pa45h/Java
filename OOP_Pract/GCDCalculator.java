import java.util.Scanner;

public class GCDCalculator {
    public static void main(String[] args) 
    {
        System.out.println("\n Name: Parth Katariya \n Enrollment No: 230410107073\n\n");
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second integer: ");
        int num2 = sc.nextInt();
        int result = gcd(num1, num2);
        System.out.println("GCD: " + result);
    }
    
    public static int gcd(int num1, int num2) 
    {
        while(num2 != 0) 
        {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }
}
