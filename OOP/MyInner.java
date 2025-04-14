
class Date
{
	public Date(long l) {
		// TODO Auto-generated constructor stub
	}

	int dd,mm,yy;
	
	//Date(int dd, int mm, ind yy)
	//{ dd=d; mm=m; yy=y;}
	
	class Time
	{
		int hr,mm,sc;
		
		Time(int a, int b, int c, int h, int mm, int s)
		{
			dd=a; 
			Date.this.mm=b; 
			yy=c;
			hr=h;
			this.mm=mm;
			sc=s;
		}
		
		void display()
		{
			show();
			System.out.print("\n\n Time ="+hr+":"+mm+":"+sc);
		}
		
		void show()
		{
			System.out.print("\n\n Date="+dd+":"+mm+":"+yy);
		}
		
	}
}

public class MyInner {

	public static void main(String[] args) 
	{
//1)	Date d1 = new Date(29,1,2025);
//		Date.Time t1 = d1.new Time(7,38,30);
		
//2)	Date.Time dt = new Date(29,1,2025).new Time(7,40,30);

//3)
		Date.Time dt = new Date().new Time(29,1,2025,7,46,50);
		dt.display();
		
	}

}
