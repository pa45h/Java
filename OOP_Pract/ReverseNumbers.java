import java.util.Scanner;

public class ReverseNumbers {
    public static void main(String[] args) 
    {
        System.out.println("\n Name: Parth Katariya \n Enrollment No: 230410107073\n\n");
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 numbers:");
        
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) 
        {
            numbers[i] = sc.nextInt();
        }
        
        System.out.println("Reversed numbers:");
        int[] reversed = reverseArray(numbers);
        for (int i = 0; i < reversed.length; i++) 
        {
            System.out.print(reversed[i] + " ");
        }
        System.out.println();
    }
    
    public static int[] reverseArray(int[] arr) 
    {
        int[] rev = new int[arr.length];
        
        for (int i = 0; i < arr.length; i++) 
        {
            rev[i] = arr[arr.length - 1 - i];
        }
        return rev;
    }
}
