

class Rect
{
	int l,w;
	
	Rect(int l, int w)
	{
		this.l=l;
		this.w=w;
	}
	
	void show()
	{
		System.out.print("\n\nLength = "+l);
		System.out.print("\nWidth = "+w);
	}
	
	int area()
	{
		return l*w;
	}
}

//class CHILD extends PARENTS
class Rect3d extends Rect
{
	int h;
	
	Rect3d(int l, int w, int h)
	{
		super(l,w);	// super(); is used to call parent constructor
		this.h=h;
	}
	
	void show()
	{
		super.show();
		System.out.print("\nHeight = "+h);
		System.out.print("\n\nVolume = "+(h*super.area()));
	}
}

public class MyInheritance {

	public static void main(String[] args) 
	{
		Rect3d r = new Rect3d(2,3,4);
		r.show();
	}

}
