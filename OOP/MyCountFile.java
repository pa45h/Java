
import java.util.*;
import java.io.*;

public class MyCountFile {

	public static void main(String[] args) {
		
		try
		{
			String f1;
			Scanner scan = new Scanner(System.in);
				
			System.out.print("\nEnter File-Name : ");
			f1=scan.next();
			
			FileInputStream fis = new FileInputStream("src//"+f1);
			
			int n=0;
			int u=0,l=0,s=0,d=0,e=0,sc=0;
			
			while(n!=-1) 
			{
				n=fis.read();
				
				if(n>=65 && n<=90)
					u++;	//upper
				else if(n>=97 && n<=122)
					l++;	//lower
				else if(n==32)
					s++;	//space
				else if(n>=48 && n<=57)
					d++;	//digits
				else if(n==13)
					e++;	//enter
				else 
					sc++;
			}
			System.out.println("\n\n Lower Count: "+l+"\n Upper Count: "+u+"\n Space Count: "+s+"\n Digits Count: "+d+"\n Line Count: "+e+"\n Special Char Count: "+sc);
			fis.close();
		}
		catch(Exception e) {}
		

	}

}
