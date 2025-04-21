import java.io.File; 
import java.io.FileWriter; 
import java.io.IOException; 
import java.util.Random;

public class RandomIntegerFileWriter { 
	public static void main(String[] args) { 
		String fileName = "123.txt"; 
		File file = new File(fileName); 
		try { 
			FileWriter writer = new FileWriter(file, true); 
			Random rand = new Random(); 
			for (int i = 0; i < 150; i++) { 
				int randomInt = rand.nextInt(1000);  
				writer.write(randomInt + " "); 
			} 
			writer.write("\n");  
			writer.close(); 
			System.out.println("150 random integers written to " + fileName); 
		} catch (IOException e) { 
			System.out.println("An error occurred while writing to the file."); 
            e.printStackTrace(); 
        } 
   
		System.out.println("\n Name: Parth Katariya \n Enrollment No: 230410107073\n\n");
    } 
}