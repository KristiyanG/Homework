package warGame;

public class WarGame {
	static int player1Wins = 0;
	static int player2Wins = 0;
	static Card[] deck = new Card[52];
	static int a5 = 0;

	public static void main(String[] args) {

		Deck d = new Deck();
		d.shuffle();
		Gamer player1 = new Gamer();
		Gamer player2 = new Gamer();
		int index = 0;
		for (int i = 0; i < 26; i++) {

			player1.cards[i] = d.deck[index];
			index++;
			player2.cards[i] = d.deck[index];
			index++;
		}

		do {
			Card a = player1.dealCard();
			Card b = player2.dealCard();
			compareCards(a, b, player1, player2);

		} while (a5 <= player1.cards.length);
		System.out.println("-----------");
		for (int i = 0; i < player1.winsCards.length; i++) {
			if (player1.winsCards[i] != null) {
				System.out.println(player1.winsCards[i].toString());
			}
		}
		for (int i = 0; i < deck.length; i++) {
			if (deck[i] != null) {
				System.out.println(deck[i].toString());
			}
		}
		System.out.println(player1Wins>player2Wins?"Player1 wins !":"Player2 wins !");

	}

	public static void compareCards(Card a, Card b, Gamer player1, Gamer player2) {

		addCardsInDeck(a);
		addCardsInDeck(b);
		a5++;
		if (a != null && b != null) {
			System.out.println(a.toString() + " of " + b.toString());
			if ((a.getCardNum() % 13 > b.getCardNum() % 13)) {
				System.out.println("Player1 wins");
				
				player1.addWinsCards(deck);
				player1Wins++;

			} else if (a.getCardNum() % 13 < b.getCardNum() % 13) {
				player1.addWinsCards(deck);
				player2Wins++;
				System.out.println("Player2 wins");

			} else {
				System.out.println("war");
				for (int i = 0; i < 2; i++) {
					Card s = player1.dealCard();
					Card s1 = player2.dealCard();
					if (s != null && s1 != null) {
						addCardsInDeck(s);

						addCardsInDeck(s1);
						a5++;
						System.out.println(s.toString() + " of "
								+ s1.toString());
					}

				}
				Card a1 = player1.dealCard();
				Card b1 = player2.dealCard();
				if (a1 != null && b1 != null) {
					addCardsInDeck(a1);
					addCardsInDeck(b1);
					compareCards(a1, b1, player1, player2);
					a5++;
				}

			}
		} else {
			return;
		}
		return;
	}

	public static void addCardsInDeck(Card a) {
		for (int i = 0; i < deck.length; i++) {
			if (deck[i] != null) {
				if (a != null) {
					deck[i] = a;
					break;
				}
			}
		}
	}

}