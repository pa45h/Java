import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) 
    {
        System.out.println("\n Name: Parth Katariya \n Enrollment No: 230410107073\n\n");
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an expression (e.g. 3+4 or 3 + 4): ");
        String expr = sc.nextLine();
        expr = expr.replaceAll(" ", "");
        int opIndex = -1;
        char op = ' ';
        
        for (int i = 0; i < expr.length(); i++) 
        {
            char c = expr.charAt(i);
            if (c == '+' || c == '-' || c == '*' || c == '/') {
                op = c;
                opIndex = i;
                break;
            }
        }
        double num1 = Double.parseDouble(expr.substring(0, opIndex));
        double num2 = Double.parseDouble(expr.substring(opIndex + 1));
        double res = 0;
        switch (op) {
            case '+': res = num1 + num2; break;
            case '-': res = num1 - num2; break;
            case '*': res = num1 * num2; break;
            case '/': res = num1 / num2; break;
        }
        System.out.println("Result: " + res);
    }
}
