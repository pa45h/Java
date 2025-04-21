public class MatrixChecker {
    public static void main(String[] args) {
        System.out.println("\n Name: Parth Katariya \n Enrollment No: 230410107073\n\n");
        System.out.println("Generating a 6x6 matrix of 0's and 1's...");
        int[][] matrix = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                matrix[i][j] = (int)(Math.random() * 2);
            }
        }
        System.out.println("Matrix:");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\nChecking each row for an odd number of 1's:");
        for (int i = 0; i < 6; i++) {
            int count = 0;
            for (int j = 0; j < 6; j++) {
                if (matrix[i][j] == 1)
                    count++;
            }
            System.out.println("Row " + (i + 1) + " has " + count + " 1's which is " + (count % 2 == 1 ? "odd" : "even"));
        }
        System.out.println("\nChecking each column for an odd number of 1's:");
        for (int j = 0; j < 6; j++) {
            int count = 0;
            for (int i = 0; i < 6; i++) {
                if (matrix[i][j] == 1)
                    count++;
            }
            System.out.println("Column " + (j + 1) + " has " + count + " 1's which is " + (count % 2 == 1 ? "odd" : "even"));
        }
    }
}
