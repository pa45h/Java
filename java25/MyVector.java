import java.util.Enumeration;
import java.util.Vector;

class User1{
	int no,age;
	String name;
	
	User1(int no, String name, int age)
	{
		this.no=no;
		this.name=name;
		this.age=age;
	}
	
	public String toString() {
		return ("\n "+no+", "+name+", "+age);
	}
}

public class MyVector {

	public static void main(String[] args) {
		
		Vector vc = new Vector();
		
		System.out.print("\nSize: "+vc.size());
		System.out.print("\nCapacity: "+vc.capacity());
		
		vc.add(Integer.valueOf(10));
		vc.add(new String("QWE"));
		vc.add(new User1(01,"Marmik",23));
		vc.add(new User1(02,"Parth",34));
		vc.add(new User1(03,"DEF",45));
		vc.add(new String("XYZ"));
		
		System.out.print("\nSize: "+vc.size());
		System.out.print("\nCapacity: "+vc.capacity());
		
		Enumeration e = vc.elements();
		
		while(e.hasMoreElements())
		{
			System.out.print("\n "+e.nextElement());
		}
	}

}
