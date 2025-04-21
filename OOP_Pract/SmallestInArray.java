import java.util.Scanner; 


public class SmallestInArray {
		public static int findMin(int[] arr, int index) { 
			if (index == arr.length - 1) { 
				return arr[index]; 
			} 
			int minRest = findMin(arr, index + 1); 
			return Math.min(arr[index], minRest); 
		} 
		public static int productOfDigits(int num) { 
			num = Math.abs(num); 
			if (num < 10) { 
				return num; 
			} 
			return (num % 10) * productOfDigits(num / 10); 
		} 
		public static void main(String[] args) { 
			System.out.println("\n Name: Parth Katariya \n Enrollment No: 230410107073\n\n");
			Scanner scanner = new Scanner(System.in); 
			System.out.print("Enter the number of elements in the array: "); 
			int n = scanner.nextInt(); 
			int[] arr = new int[n];                                                                                                                  
			System.out.println("Enter " + n + " integers:"); 
			for (int i = 0; i < n; i++) { 
				arr[i] = scanner.nextInt(); 
			} 
			int min = findMin(arr, 0); 
			System.out.println("The smallest number in the array is: " + min); 
			System.out.print("Enter an integer to find product of its digits: "); 
			int num = scanner.nextInt(); 
			int product = productOfDigits(num); 
			System.out.println("Product of digits: " + product); 
			scanner.close(); 
	}

}

