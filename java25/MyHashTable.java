import java.util.*;

class User4{
	int no,age;
	String name;
	
	User4(int no, String name, int age)
	{
		this.no=no;
		this.name=name;
		this.age=age;
	}
	
	public String toString() {
		return ("\n "+no+", "+name+", "+age);
	}
}

public class MyHashTable {

	public static void main(String[] args) 
	{
		Hashtable ht = new Hashtable();
		
		
		ht.put("A", new User4(101,"MARMIK & PARTH",12));
		ht.put("B", new User4(102,"MARMIK & PARTH",13));
		ht.put("C", new User4(103,"MARMIK & PARTH",14));
		ht.put("D", new User4(104,"MARMIK & PARTH",15));
		ht.put("E", new User4(105,"MARMIK & PARTH",16));
	
				
		System.out.print("\n "+ht.get("A"));
		
	}
}
