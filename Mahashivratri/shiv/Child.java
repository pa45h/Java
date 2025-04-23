package shiv;

public class Child extends Parent
{
	public Child(int a,int b,int c,int d)
	{
		super(a,b,c,d);
	}
	
	public void disp()
	{
		show();
		System.out.print("\n IN THE SAME PACKAGE SUB CLASS");
		
		//System.out.print("\n Private = "+pri);
		
		System.out.print("\n Default = "+def);
		System.out.print("\n Protected ="+pro);
		System.out.print("\n Public ="+pub);
		
		Parent p1 = new Parent(100,200,300,400);
		System.out.print("\n IN THE SAME PACKAGE NON SUB CLASS");
		
		//System.out.print("\n Private = "+pri);
		
		System.out.print("\n Default = "+p1.def);
		System.out.print("\n Protected ="+p1.pro);
		System.out.print("\n Public ="+p1.pub);
	}
	
}