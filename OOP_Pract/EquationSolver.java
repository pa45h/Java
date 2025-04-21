
public class EquationSolver {

	public static void main(String[] args) 
	{
		System.out.println("\n Name: Parth Katariya \n Enrollment No: 230410107073\n\n");
		double a = 3.4, b = 50.2, e = 44.5;
        double c = 2.1, d = 0.55, f = 5.9;
        double denominator = a * d - b * c;
        double x = (e * d - b * f) / denominator;
        double y = (a * f - e * c) / denominator;
        System.out.println("x: " + x);
        System.out.println("y: " + y);
	}

}
