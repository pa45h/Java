import java.util.*;
import java.io.*;


public class MyReplaceWord {

	public static void main(String[] args) {
		try {
			
			String f,oldW,newW;
			String line=" ", data=" ";
			Scanner sc = new Scanner(System.in);

			System.out.print("\n Enter File Name : ");
			f = sc.next();
			System.out.print("\n Enter Old Word : ");
			oldW = sc.next();
			System.out.print("\n Enter New Word : ");
			newW = sc.next();
			
			FileReader fr = new FileReader("src//"+f);
			BufferedReader br = new BufferedReader(fr);
			
			while(line!=null)
			{
				line=br.readLine();
				
				if(line!=null)
				{
					data+=line+"\n";
				}
			}
			fr.close();
			
			data=data.replace(oldW, newW);
			
			FileWriter fw = new FileWriter("src//"+f);
			fw.write(data);
			fw.close();
			
		}
		catch(Exception e) {}
	}

}
