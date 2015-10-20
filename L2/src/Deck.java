import java.util.ArrayList;
import java.util.List;

//TODO
//separate deck functionality from constructor and getter methods
//another class for dealing cards is necessary  

public class Deck{
	private List<Card> deck = new ArrayList<Card>();
	/*
	 * constructor of class Deck, building entire deck adding cards to the list
	 */
	Deck(){
	  try{
		for(int i=2; i<15; i++){
			deck.add(new Card(i, "clubs"));
			deck.add(new Card(i, "diamonds"));
			deck.add(new Card(i, "hearts"));
			deck.add(new Card(i, "spades"));
		}
	  }
	  catch(PokerException ex){
	    //TODO
	  }
	}
	
	/*
	 * Method for getting entire deck as a list of cards
	 */
	public List<Card> getListOfCardsInDeck(){
		return deck;
	}
	
	public void updateCurrentStateOfDeck(List<Card> updatedDeck){
		this.deck = updatedDeck;
	}
}
