import java.util.*;

public class AreaTringle {
    public static void main(String[] args) {

        int b, ph;
        Scanner s = new Scanner(System.in);

        System.out.println("\nEnter the base: ");
        b = s.nextInt();

        System.out.println("\nEnter perpendicular height: ");
        ph = s.nextInt();

        float a = (1 / 2f) * b * ph;

        System.out.println("\nArea of triangle= " + a);
    }
}