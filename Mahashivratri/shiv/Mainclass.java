import shiv.*;

class Kartikey extends Parent
{
	Kartikey(int a,int b,int c,int d)
	{
		super(a,b,c,d);
	}
	void display()
	{
		System.out.print("\n IN THE DIFF PACKAGE SUB CLASS ");
		//System.out.print("\n Private = "+pri);
		//System.out.print("\n Default = "+def);
		System.out.print("\n Protected ="+pro);
		System.out.print("\n Public ="+pub);
	}
}

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c1 = new Child(10,20,30,40);
		c1.disp();
		
		Kartikey k = new Kartikey(1000,2000,3000,4000);
		k.display();
		
		Parent p2 = new Parent(1,2,3,4);
		System.out.print("\n IN THE DIFF PACKAGE NON SUB CLASS ");
		//System.out.print("\n Private = "+pri);
		//System.out.print("\n Default = "+def);
		//System.out.print("\n Protected ="+p2.pro);
		System.out.print("\n Public ="+p2.pub);
	}

}