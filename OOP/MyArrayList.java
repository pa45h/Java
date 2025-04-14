import java.util.ArrayList;

class User2{
	int no,age;
	String name;
	
	User2(int no, String name, int age)
	{
		this.no=no;
		this.name=name;
		this.age=age;
	}
	
	public String toString() {
		return ("\n "+no+", "+name+", "+age);
	}
}


public class MyArrayList {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		
		list.add(new User2(101,"Marmik & PARTH",12));
		list.add(new User2(102,"Marmik & PARTH",13));
		list.add(new User2(103,"Marmik & PARTH",14));
		list.add(new User2(104,"Marmik & PARTH",15));
		list.add(new User2(105,"Marmik & PARTH",16));
		
		for(int i=0;i<list.size();i++) 
		{
			System.out.print("\n "+list.get(i));
		}

	}

}
