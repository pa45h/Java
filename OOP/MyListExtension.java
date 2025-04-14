import java.io.File;
import java.util.*;

public class MyListExtension {

	public static void main(String[] args) {
		String loc, ext;
		Scanner sc = new Scanner(System.in);
		

		System.out.print("Enter location: ");
		loc=sc.next();
		System.out.print("Enter Extension: ");
		ext=sc.next();
		
		File f = new File(loc);
		
		String content[] = f.list();
		
		for(int i=0;i<content.length;i++)
		{
			if(content[i].endsWith(ext))
			{
				System.out.println(content[i]);
			}
		}
		
	}

}
