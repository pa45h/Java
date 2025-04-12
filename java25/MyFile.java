import java.io.*;
import java.util.*;

public class MyFile {

	public static void main(String[] args) 
	{
		File file = new File("src//MyBook.java");
		
		System.out.println("Exist : "+file.exists());
		System.out.println("Bytes : "+file.length());
		System.out.println("Name : "+file.getName());
		System.out.println("Location : "+file.getAbsolutePath());
		System.out.println("Is it File ? "+file.isFile());
		System.out.println("Is Directory ? "+file.isDirectory());
		System.out.println("Can Read ? "+file.canRead());
		System.out.println("Can Write ? "+file.canWrite());
		
		long l = file.lastModified();
		Date dd = new Date(l);
		
		System.out.println("Last Modified : "+dd);
		
		File ff = new File("src//z.java");
//		try {
//			ff.createNewFile();
//		}catch(Exception e) {}
		
		
//		file.renameTo(ff);
		
	//	ff.renameTo(file);
		
		
		ff.delete();
	}

}
