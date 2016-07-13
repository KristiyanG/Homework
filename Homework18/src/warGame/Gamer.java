package warGame;

public class Gamer {
	String name;
	static Card[] cards ;
	Card[] windsCards ;
	private int topCard;
	static int indexOfCard=0;
	public Gamer() {
		cards = new Card[26];
		 windsCards = new Card[52];
	}
	public Card dealCard() {
		Card theCard;
		if (topCard < cards.length) {
			theCard = cards[topCard];
			topCard++;
		} else
			theCard = null;

		return theCard;
	}

	public void shuffle() {

		topCard = 0;

		for (int i = 0; i < 1000; i++) {
			int j = (int) (Math.random() * 52);
			Card a= new Card(j);
			if(a!=null){
				cards[i]=a;
				a=null;
			}
			
			
		}
	}
	public void printHand() {

	     if(indexOfCard<cards.length){  
	    	 System.out.println(cards[indexOfCard]);
	    	 indexOfCard++;
    		System.out.println();
	     }

} 
}
