// wap to implement game of snake and ladders. where there are 2 players and both have to score 50.
// when player reaches to 8,19,27,32,39,43,49 the player will be bitten and score would be decreased by 8.
// when player reaches to 14,23,30,37,42 the player will get ladder and score will be increased by 5.

import java.util.*;
import java.io.*;

class Player implements Runnable
{
	Thread th;
	String name;
	int score,dice;
	Board b;
	
	Player(String name, Board b)
	{
		th = new Thread(this);
		this.name=name;
		this.b=b;
		score=dice=0;
		th.start();
	}
	
	public void run()
	{	
		while(score<=50)
		{
			dice = b.throwDice(name);
			score+=dice;
			
			System.out.println("\n\nDice for : "+name+" = "+dice);
			if(score==50)
			{
				System.out.println("\n\n "+name+" WON THE GAME 🥳🥂!");
				System.out.println("\n "+name+"'s Score = "+score);
				System.exit(0);
			}
			else if(score==8 || score==19 || score==27 || score==32 || score==39 || score==43 || score==49)
			{
				score-=8;
				System.out.println("\n\n "+name+" Bitten by 🐍!");
				System.out.println("\n "+name+"'s Score = "+score);
			}
			else if(score==14 || score==23 || score==30 || score==37 || score==42)
			{
				score+=5;
				System.out.println("\n\n "+name+" Has Got 🪜!");
				System.out.println("\n "+name+"'s Score = "+score);
			}
			else if(score>50)
			{
				score-=dice;
				System.out.println("\n "+name+"'s Score = "+score);
			}
			System.out.println("\n "+name+"'s Score = "+score);
		}
	}
}

class Board
{
	BufferedReader br;
	Random r = new Random();
	
	synchronized int throwDice(String name)
	{
		try {
			Thread.sleep(250);
		}catch(Exception e) {}
		
		br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\n Press enter to throw the dice for : "+name);
		
		try {
			br.read();
		}catch(Exception e) {}
		
		int dice = r.nextInt(6);
		
		return ++dice;
	}
}

public class SnakeLadder {

	public static void main(String[] args) {
		
		Board b = new Board();
		
		Player p1 = new Player("Parth",b);
		Player p2 = new Player("Marmik",b);
	}

}
