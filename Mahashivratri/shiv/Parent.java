package shiv;

public class Parent {
	private int pri;
	int def;
	protected int pro;
	public int pub;
	
	public Parent(int a,int b,int c,int d)
	{
		pri=a;
		def=b;
		pro=c;
		pub=d;
	}
	public void show()
	{
		System.out.print("\n IN THE SAME CLASS ");
		System.out.print("\n Private = "+pri);
		System.out.print("\n Default = "+def);
		System.out.print("\n Protected ="+pro);
		System.out.print("\n Public ="+pub);
	}
}