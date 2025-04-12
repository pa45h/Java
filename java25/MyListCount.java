
import java.util.*;
import java.io.*;

public class MyListCount {

	public static void main(String[] args) {
		String loc;
		int dir=0,file=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter location: ");
		loc=sc.next();
		
		File f = new File(loc);
		String content[] = f.list();
		
		for(int i=0;i<content.length;i++)
		{
			File cf = new File(loc,content[i]);
			
			if(cf.isFile())
			{
				file++;
				System.out.println("File:  "+content[i]);
			}
			
			if(cf.isDirectory())
			{
				dir++;
				System.out.println("Dir:  "+content[i]);
			}
		}
		System.out.println("\n\n Files: "+file+"\n Directories: "+dir);
	}

}
