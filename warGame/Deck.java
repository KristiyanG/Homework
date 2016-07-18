package warGame;

public class Deck {

    Card[] deck = new Card[52];
    private int topCard;

    Deck() {

        topCard = 0;

        for (int i = 0; i < deck.length; i++)
            deck[i] = new Card(i);

    }

    public void shuffle() {

        topCard = 0;

        for (int i = 0; i < deck.length; i++) {
            int j = (int)(Math.random()*52);
           
            
            deck[i] = new Card(j);
        } 
   }

    public Card dealCard() {
        Card theCard;
        if (topCard < deck.length) {
            theCard = deck[topCard];
            topCard++;
        }
        else
            theCard = null;

        return theCard;
    }
   
}