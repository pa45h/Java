import java.util.Scanner;
public class DecimalToFraction {
    public static void main(String[] args) {
        System.out.println("\n Name: Parth Katariya \n Enrollment No: 230410107073\n\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        String input = sc.nextLine().trim();
        String[] parts = input.split("\\.");
        long integerPart = parts[0].isEmpty() ? 0 : Long.parseLong(parts[0]);
        long numerator = 0;
        long denominator = 1;
        if (parts.length == 2 && !parts[1].isEmpty()) {
            numerator = Long.parseLong(parts[1]);
            denominator = (long) Math.pow(10, parts[1].length());
            long gcd = gcd(numerator, denominator);
            numerator /= gcd;
            denominator /= gcd;
        }
        if (numerator == 0)
            System.out.println("Fraction: " + integerPart);
        else if (integerPart == 0)
            System.out.println("Fraction: " + numerator + "/" + denominator);
        else
            System.out.println("Fraction: " + integerPart + " " + numerator + "/" + denominator);
        sc.close();
    }
    private static long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
