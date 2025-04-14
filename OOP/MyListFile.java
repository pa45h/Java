import java.util.*;
import java.io.*;

public class MyListFile {

	public static void main(String[] args) 
	{
		String loc;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Location : ");
		loc = sc.next();
		
		File f = new File(loc);
		
		String ls[] = f.list();
		
		for(int i=0;i<ls.length;i++)
		{
			System.out.println(""+ls[i]);
		}
	}

}
