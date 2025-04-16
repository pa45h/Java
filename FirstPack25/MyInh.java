import svit.*;
import kpgu.*;

class Box3d extends Box
{
	int h,vol;
	
	Box3d(int l, int w, int h)
	{
		super(l,w);
		this.h=h;
		vol = h*super.area();
	}

	void disp()
	{
		super.show();
		System.out.print("\nHeight = "+h);
		System.out.print("\nVolume = "+vol);

	}
}

public class MyInh
{
public static void main(String[]args)
{
	Box3d b1 = new Box3d(10,20,30);
	b1.disp();
	Circle c1 = new Circle(10);
	c1.show();
}
}
