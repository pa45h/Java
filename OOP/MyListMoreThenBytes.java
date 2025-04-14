import java.io.File;
import java.util.Scanner;

public class MyListMoreThenBytes {

	public static void main(String[] args) {
		
		String loc;
		int byt,ct=0;
		Scanner sc = new Scanner(System.in);
		

		System.out.print("Enter location: ");
		loc=sc.next();
		System.out.print("Enter Bytes: ");
		byt=sc.nextInt();
		
		File f = new File(loc);
		
		String content[] = f.list();
		
		for(int i=0;i<content.length;i++)
		{
			File cf = new File(loc,content[i]);
			
			if(cf.length()>byt)
			{
				System.out.println("File:  "+content[i]+" : bytes: "+cf.length());
				ct++;
			}
		}
		
		System.out.println("\n\tCount: "+ct);
	}

}
