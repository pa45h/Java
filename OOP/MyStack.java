
import java.util.Stack;

class User{
	int no,age;
	String name;
	
	User(int no, String name, int age)
	{
		this.no=no;
		this.name=name;
		this.age=age;
	}
	
	public String toString() {
		return ("\n "+no+", "+name+", "+age);
	}
}

public class MyStack {

	public static void main(String[] args) {
		
		Stack st = new Stack();
		
		System.out.print("\nSize: "+st.size());
		System.out.print("\nCapacity: "+st.capacity());
		
		st.push(Integer.valueOf(0));
		st.push(Float.valueOf(3.14f));
		st.push(new String("Marmik"));
		st.push(new String("Parth"));
		st.push(new User(01,"C",23));
		st.push(new String("D"));
		st.push(new String("E"));
		st.push(new User(02,"F",34));
		st.push(new String("G"));
		st.push(new User(03,"H",45));
		st.push(new String("I"));
		
		System.out.print("\nSize: "+st.size());
		System.out.print("\nCapacity: "+st.capacity());
		
		while(!st.empty())
		{
			System.out.println(" "+st.pop());
		}
		
		
	}

}
