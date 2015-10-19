import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class DeckTest {
	private Deck deck;
	
	@Before
	public void setUp() throws Exception {
		deck = new Deck();
	}

	@Test
	public void testCardConstructor() {
		final Card karta = new Card(5, "clubs");
		assertEquals("5 of clubs", karta.getFullCardName());
	}
	
	@Test
	public void testDeckConstructor(){
		assertEquals(52, deck.getListOfCardsInDeck().size());
	}
	
	@Test
	public void testShuffleMechanism(){
		final Card testCard = deck.getListOfCardsInDeck().get(5);
		deck.shuffleDeck();
		assertNotEquals(testCard, deck.getListOfCardsInDeck().get(5));
	}

	@Test
	public void testDealWithoutShuffle(){
		assertEquals(new Card(3, "diamonds").getFullCardName(), deck.dealCardsToPlayers(3, 3).get(1).get(2).getFullCardName());
	}
	
	@Test
	public void testDealWithShuffle(){
		deck.shuffleDeck();
		assertNotEquals(new Card(3, "diamonds").getFullCardName(), deck.dealCardsToPlayers(3, 3).get(1).get(2).getFullCardName());
	}
}
