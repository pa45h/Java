import java.util.*;

class Box
{
	int len,wid;
	Scanner sc = new Scanner(System.in);
	
	void input()
	{
		System.out.print("\nLength : ");
		len = sc.nextInt();
		System.out.print("\nWidth : ");
		wid = sc.nextInt();	
	}
	
	void show()
	{
		System.out.print("\n\nLength= "+len);
		System.out.print("\nWidth= "+wid);
	}
	
	int area()
	{
		return len*wid;
	}
}

class Box3d
{
	Box b = new Box();
	int h;
	Scanner sc = new Scanner(System.in);
	
	void enter()
	{
		b.input();
		System.out.print("\nHeight : ");
		h = sc.nextInt();	
	}
	
	void display()
	{
		b.show();
		System.out.print("\nHeight= "+h);
		System.out.print("\n\nVolume= "+(h*b.area()));
	}
}


public class MyContainer {

	public static void main(String[] args) 
	{
		Box3d b1 = new Box3d();
		b1.enter();
		b1.display();

	}

}
