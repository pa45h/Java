
public class AssTest {
		  public static void main (String[] args)
		  { 
		    int a[] = {1,2,3,4,5}; 
		    int i, j, m; 
		    i = ++a[1]; 
		    j = a[1]++; 
		    m = a[i++]; 
		    System.out.println( i + "," + j + "," + m); 
		  } 
		

}
