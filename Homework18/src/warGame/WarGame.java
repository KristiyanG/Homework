package warGame;

import java.util.Scanner;

public class WarGame {
	static int player1Wins=0;
	static int player2Wins=0;
	public static void main(String[] args) {
		
		
	    Gamer player1=new Gamer();
	    Gamer player2=new Gamer();

	    //reduced this to 26 iterations because two cards are dealt each iteration
	    for (int i = 0; i < 26; i++) {
	    	int j = (int) (Math.random() * 52);
	    	
	   
	    
	            player1.shuffle();
	            player2.shuffle();
	    }
	    
	    if(player1Wins>player2Wins){
	    	System.out.println("Player One Wins The War");
	    }
	    else {
	    	 System.out.println("Player Two Wins The War");
	    }
	    
	}

    
}