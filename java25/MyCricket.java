
class Cricket
{
	String pName, cName;
	
	Cricket(String pName, String cName)
	{
		this.pName=pName;
		this.cName=cName;
	}
	
	void show()
	{
		System.out.println("\n\nPlayer Name = "+pName);
		System.out.println("\nCountry Name = "+cName);
	}
}

class Batsman extends Cricket
{
	int matches;
	int runs;
	
	Batsman(String pName, String cName, int matches, int runs)
	{
		super(pName,cName);
		this.matches=matches;
		this.runs=runs;
	}
	
	void display()
	{
		super.show();
		System.out.println("\nMatches Played = "+matches);
		System.out.println("\nBatsman's runs = "+runs);
	}
}

class Bowler extends Batsman
{
	int overs;
	int wickets;
	
	Bowler(String pName, String cName, int matches, int runs, int overs, int wickets)
	{
		super(pName,cName,matches,runs);
		this.overs=overs;
		this.wickets=wickets;
	}
	
	void output()
	{
		super.display();
		System.out.println("\nBawler's Overs = "+overs);
		System.out.println("\nBawler's Wicket = "+wickets);
	}
}

public class MyCricket 
{
	public static void main(String[]args)
	{
		Bowler b1 = new Bowler("Parth","India",58,599,289,110);
		b1.output();
	}

}
