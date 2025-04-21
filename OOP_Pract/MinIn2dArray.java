
public class MinIn2dArray {
	 public static <T extends Comparable<T>> T findMin(T[][] array) { 
	        T min = array[0][0]; 
	        for (T[] row : array) { 
	            for (T element : row) { 
	                if (element.compareTo(min) < 0) { 
	                    min = element; 
	                } 
	            } 
	        } 
	        return min; 
	    } 
	 
	    public static void main(String[] args) { 
			System.out.println("\n Name: Parth Katariya \n Enrollment No: 230410107073\n\n");

	        Integer[][] intArray = { 
	            {5, 3, 9}, 
	            {2, 8, 1}, 
	            {4, 7, 6} 
	        }; 
	   
	        String[][] strArray = { 
	            {"orange", "banana"}, 
	            {"apple", "grape"} 
	        }; 
	 
	        System.out.println("Minimum in Integer array: " + findMin(intArray));  
	        System.out.println("Minimum in String array: " + findMin(strArray));  
	    }
}
