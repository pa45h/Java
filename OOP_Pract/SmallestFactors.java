import java.util.Scanner;

public class SmallestFactors {
    public static void main(String[] args) 
    {
        System.out.println("\n Name: Parth Katariya \n Enrollment No: 230410107073\n\n");
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        
        System.out.print("Smallest factors: ");
        
        for (int i = 2; i <= n; i++) {
            while(n % i == 0) 
            {
                System.out.print(" "+i);
                n /= i;
            }
        }
        System.out.println();
    }
}
