
class Bx
{
	int len,wid;
	static int st;
	
	Bx(int len, int wid, int st)
	{
		this.len=len;
		this.wid=wid;
		this.st=st;
	}
	
	void show()
	{
		System.out.println("\n\nLength = "+len);
		System.out.println("\nWidth = "+wid);
		System.out.println("\n	Static = "+st);
	}
	static void display()
	{
		System.out.println("\n\nStatic = "+st);
	}
}

public class MyStatic {

	public static void main(String[] args) 
	{
		Bx b1 = new Bx(1,2,3);
		Bx b2 = new Bx(10,20,30);
		Bx b3 = new Bx(100,200,300);
		
		b1.show();
		b2.show();
		b3.show();
		
//		System.out.println("\n\nLength = "+Bx.len);		ERROR
//		System.out.println("\nWidth = "+Bx.wid);		ERROR
		System.out.println("\n	Static = "+Bx.st);
		
	}

}
