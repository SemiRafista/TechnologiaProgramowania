import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck{
	private List<Card> deck = new ArrayList<Card>();
	private int deckCounter;
	Deck(){
		for(int i=2; i<15; i++){
			deck.add(new Card(i, "clubs"));
			deck.add(new Card(i, "diamonds"));
			deck.add(new Card(i, "hearts"));
			deck.add(new Card(i, "spades"));
		}
		deckCounter = 0;
	}
	
	public List<Card> GetListOfCardsInDeck(){
		return deck;
	}
	
	public void ShuffleDeck(){
		Collections.shuffle(deck);
	}
	
	private List<Card> SingleDeal(int cardsAmount){
		return deck.subList(deckCounter, deckCounter + cardsAmount + 1); 
	}
	
	public List<List<Card>> DealCardsToPlayers(int playersAmount, int cardsAmount){
	List<List<Card>> allDeals = new ArrayList<List<Card>>();
		if(playersAmount == 0  || cardsAmount == 0) return null;	
		for(int i = 0; i < playersAmount; i++){
			allDeals.add(SingleDeal(cardsAmount));
			deckCounter += cardsAmount;
		}
	return allDeals;
	}
}
