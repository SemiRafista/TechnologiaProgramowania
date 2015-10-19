import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//TODO
//separate deck functionality from constructor and getter methods
//another class for dealing cards is necessary  

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
	
	public List<Card> getListOfCardsInDeck(){
		return deck;
	}

	public void shuffleDeck(){
		List<Card> tempList = new ArrayList<Card>();
		Random rand = new Random();
		int index;
		for(int i=0; i<deck.size(); i++){
			index = rand.nextInt(52);
			while(tempList.contains(deck.get(index))){
				index = rand.nextInt(52);
			}
		tempList.add(deck.get(index));
		}
	deck = tempList;
	}
	
	private List<Card> singleDeal(int cardsAmount){
		return deck.subList(deckCounter, deckCounter + cardsAmount + 1); 
	}
	
	public List<List<Card>> dealCardsToPlayers(int playersAmount, int cardsAmount){
	List<List<Card>> allDeals = new ArrayList<List<Card>>();
		if(playersAmount == 0  || cardsAmount == 0) return null;	
		for(int i = 0; i < playersAmount; i++){
			allDeals.add(singleDeal(cardsAmount));
			deckCounter += cardsAmount;
		}
	return allDeals;
	}
}
