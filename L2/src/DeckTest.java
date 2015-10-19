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
		Card karta = new Card(5, "clubs");
		assertEquals("5 of clubs", karta.GetFullCardName());
	}
	
	@Test
	public void testDeckConstructor(){
		assertEquals(52, deck.GetListOfCardsInDeck().size());
	}
	
	@Test
	public void testShuffleMechanism(){
		Card testCard = deck.GetListOfCardsInDeck().get(5);
		deck.ShuffleDeck();
		assertNotEquals(testCard, deck.GetListOfCardsInDeck().get(5));
	}

	@Test
	public void testDealWithoutShuffle(){
		assertEquals(new Card(3, "diamonds").GetFullCardName(), deck.DealCardsToPlayers(3, 3).get(1).get(2).GetFullCardName());
	}
	
	@Test
	public void testDealWithShuffle(){
		deck.ShuffleDeck();
		assertNotEquals(new Card(3, "diamonds").GetFullCardName(), deck.DealCardsToPlayers(3, 3).get(1).get(2).GetFullCardName());
	}
}
