import java.util.Random;

public class RandomIntegers {
    public static void main(String[] args) 
    {
        System.out.println("\n Name: Parth Katariya \n Enrollment No: 230410107073\n\n");
        
        System.out.println("Generating 100 random integers between 1 and 49:");
        Random random = new Random(1000);
        
        for (int i = 0; i < 100; i++) 
        {
            System.out.println(random.nextInt(49) + 1);
        }
    }
}
