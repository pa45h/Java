import java.util.*;
import java.io.*;

public class MyReadFile {

	public static void main(String[] args) {
		
		String fna;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\nEnter File Name: ");
		fna=sc.next();
		
		File f = new File("src//"+fna);
		
		if(f.exists()) {
			
			try {
				FileInputStream fis = new FileInputStream("src//"+fna);
				int n=0;
				char ch=' ';
				
				while(n!=-1) 
				{
					n=fis.read();
					ch=(char)n;
					System.out.print(ch);
				}
				fis.close();
			}
			catch(Exception e) {}
		}
		else {
			System.out.println("\nFile does not exist!");
		}

	}

}
