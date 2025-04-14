import java.util.*;
import java.io.*;

/*
 * ObjectInputStream --> used to read object in file
 * ObjectOutputStream --> used to write in file
 * 
 * */

class Student12 implements Serializable{
	
	int id;
	String name;
	int age;
	
	Student12(int id, String name, int age)
	{
		this.id=id;
		this.name=name;
		this.age=age;
	}
	
	void show()
	{
		System.out.print("\n"+id+"\t"+name+"\t"+age);
	}
}


public class MyObjectReadWrite {

	public static void main(String[] args) {
		
		try
		{
			ObjectOutputStream oos = new ObjectOutputStream
					(new FileOutputStream("src//data.txt"));
			
			Student12 st = new Student12(101,"AAA",20);
			oos.writeObject(st);
			
			st = new Student12(102,"BBB",30);
			oos.writeObject(st);
			
			st = new Student12(103,"CCC",40);
			oos.writeObject(st);
			
			oos.close();
			
			ObjectInputStream ois = new ObjectInputStream
					(new FileInputStream("src//data.txt"));
			
			for(int i=0;i<3;i++)
			{
				st = (Student12)ois.readObject();
				
				st.show();
			}
			
			ois.close();
		}
		catch(Exception e)
		{ }
		
	}

}
