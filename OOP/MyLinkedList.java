import java.util.LinkedList;

class User3{
	int no,age;
	String name;
	
	User3(int no, String name, int age)
	{
		this.no=no;
		this.name=name;
		this.age=age;
	}
	
	public String toString() {
		return ("\n "+no+", "+name+", "+age);
	}
}

public class MyLinkedList {

	public static void main(String[] args) 
	{
		LinkedList ll = new LinkedList();
		
		ll.add(new User3(101,"Marmik & PARTH",12));
		ll.add(new User3(102,"Marmik & PARTH",13));
		ll.add(new User3(103,"Marmik & PARTH",14));
		ll.add(new User3(104,"Marmik & PARTH",15));
		ll.add(new User3(105,"Marmik & PARTH",16));
		
		ll.addFirst(new User3(100,"Marmik & PARTH",11));
		ll.addLast(new User3(106,"Marmik & PARTH",17));
		ll.add(3, new User3(1041,"Marmik & PARTH",14));
		
		ll.removeFirst();
		ll.removeLast();
		ll.remove(3);
		
		
		
		
		for(int i=0;i<ll.size();i++) 
		{
			System.out.print("\n "+ll.get(i));
		}
	}
}
