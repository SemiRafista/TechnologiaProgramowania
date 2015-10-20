import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;


public class DeckTest {
	private Deck deck;
	private CardDealer cardDealer;
	@Before
	public void setUp() throws Exception {
		deck = new Deck();
		cardDealer = new CardDealer(deck);
	}

	@Test
	public void testCardConstructor() {
		try{
	  final Card karta = new Card(5, "clubs");
		assertEquals("5 of clubs", karta.getFullCardName());
		}
		catch(PokerException ex){
		  //TODO
		}
	}
	
	@Test
	public void testDeckConstructor(){
		assertEquals(52, deck.getListOfCardsInDeck().size());
	}
	
	@Test
	public void testShuffleMechanism(){
		final Card testCard = deck.getListOfCardsInDeck().get(5);
		cardDealer.shuffleDeck();
		assertNotEquals(testCard, deck.getListOfCardsInDeck().get(5));
	}

	@Test
	public void testDealWithoutShuffle(){
		try{
	  assertEquals(new Card(3, "diamonds").getFullCardName(), cardDealer.dealCards(3, 3).get(1).get(2).getFullCardName());
		}
		catch(PokerException ex){
		  //TODO
		}
	}
	
	@Test
	public void testDealWithShuffle(){
		try{
	  cardDealer.shuffleDeck();
		assertNotEquals(new Card(3, "diamonds").getFullCardName(), cardDealer.dealCards(3, 3).get(1).get(2).getFullCardName());
		}
		catch(PokerException ex){
		  //TODO
		}
	}
	
	@Test(expected=PokerException.class)
	public void testExceptionInConstructorOfCard() throws PokerException{
	  try{
	    new Card(16,"clubs");	    
	  }
	  catch(PokerException ex){
	    throw new PokerException(ex.getMessage());
	  }
	}
	
	@Test(expected=PokerException.class)
	public void testExceptionInDealingCards() throws PokerException{
	  try{
	  cardDealer.dealCards(10, 6);
	  }
	  catch(PokerException ex){
	    throw new PokerException(ex.getMessage());
	  }
	}
	//This part will be extended as studies goes on
	//In this part i test mechanism of the game by creating few players and dealing cards to them
	@Test
	public void testDealingCardsToPlayers(){
	  Player player1 = new Player(1);
	  Player player2 = new Player(2);
	  Player player3 = new Player(3);
	  cardDealer.shuffleDeck();
	  List<List<Card>> allHands = new ArrayList<List<Card>>();
	  try{
	  allHands = cardDealer.dealCards(3, 5);
	  player1.GiveCardsToPlayer(allHands.get(0));
	  player2.GiveCardsToPlayer(allHands.get(1));
	  player3.GiveCardsToPlayer(allHands.get(2));
	  }
	  catch(PokerException ex){
	    //TODO
	  }
	}
}
