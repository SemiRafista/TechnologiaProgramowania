import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CardDealer{
	private Deck deck;
	private int deckCounter;
	CardDealer(Deck deck){
		this.deck = deck;
		deckCounter = 0;
	}
	
	/*
	 * Method used by dealCardsToPlayers 
	 */
	private List<Card> singleDeal(int cardsAmount){
		return deck.getListOfCardsInDeck().subList(deckCounter, deckCounter + cardsAmount + 1);
	}
	
	//TODO
	//deal one by one, not all amount to one player
	/*
	 * Method dealing list of cards to the list of players in specified amount
	 */
	public List<List<Card>> dealCardsToPlayers(int playersAmount, int cardsAmount){
	List<List<Card>> allDeals = new ArrayList<List<Card>>();
		if(playersAmount == 0  || cardsAmount == 0) return null;	
		for(int i = 0; i < playersAmount; i++){
			allDeals.add(singleDeal(cardsAmount));
			deckCounter += cardsAmount;
		}
	return allDeals;
	}	
	
	/*
	 * Shuffling cards in current deck
	 */
	public void shuffleDeck(){
		List<Card> tempList = new ArrayList<Card>();
		Random rand = new Random();
		int index;
		for(int i=0; i<deck.getListOfCardsInDeck().size(); i++){
			index = rand.nextInt(52);
			while(tempList.contains(deck.getListOfCardsInDeck().get(index))){
				index = rand.nextInt(52);
			}
		tempList.add(deck.getListOfCardsInDeck().get(index));
		}
	deck.updateCurrentStateOfDeck(tempList);
	}
}
