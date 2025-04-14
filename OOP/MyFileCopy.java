import java.util.*;
import java.io.*;

public class MyFileCopy {

	public static void main(String[] args) {
		
		try
		{
			String f1,f2;
			Scanner sc = new Scanner(System.in);
			
			System.out.print("\nEnter File-1 : ");
			f1=sc.next();
			System.out.print("\nEnter File-2 : ");
			f2=sc.next();
			
			FileInputStream fis = new FileInputStream("src//"+f1);
			FileOutputStream fos = new FileOutputStream("src//"+f2);
			
			int n=0;
			char c=' ';
			
			while(n!=-1) 
			{
				n=fis.read();
				fos.write(n);
			}
			fis.close();
			fos.close();
			
		}
		catch(Exception e) {}
	}

}
