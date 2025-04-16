package svit;

public class Box
{
	public int l,w;
	
	public Box(int l, int w)
	{
		this.l=l;
		this.w=w;
	}

	public void show()
	{
		System.out.print("\nLength = "+l);
		System.out.print("\nWidth = "+w);		
	}

	public int area()
	{
		return (l*w);
	}
}

