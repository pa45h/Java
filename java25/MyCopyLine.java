// copy file line by line

import java.io.BufferedReader;
import java.io.File;
import java.io.*;
import java.util.Scanner;

public class MyCopyLine {

	public static void main(String[] args) {
		try
		{
			
		String fna1, fna2;
		String line=" ";
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\n Enter 1st File Name : ");
		fna1 = sc.next();
		System.out.print("\n Enter 2nd File Name : ");
		fna2 = sc.next();
		
		
		FileReader fr = new FileReader("src//"+fna1);
		FileWriter fw = new FileWriter("src//"+fna2);
		
		BufferedReader br = new BufferedReader(fr);
		
		while(line!=null)
		{
			line = br.readLine();
			if(line!=null)
			{
				fw.write(line+"\n");
			}
		}
		fr.close();
		fw.close();
		
		}
		catch(Exception e) {}
		
	}

}