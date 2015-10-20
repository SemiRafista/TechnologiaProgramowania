public class Card {
	private int value;
	private String color;
	private String fullCardName;
	/*
	 * constructor of class Card, which builds the fullCardName
	 */
	Card(int value, String color) throws PokerException{
	  this.value = value;
		this.color = color;
		if(this.color!="clubs" && this.color!="diamonds" && this.color!="hearts" && this.color!="spades")
		  throw new PokerException("Wrong card color");
		if(value>10){
			switch(value){
			case 11: fullCardName = "Jack of " + color; break;
			case 12: fullCardName = "Queen of " + color; break;
			case 13: fullCardName = "King of " + color; break;
			case 14: fullCardName = "Ace of " + color; break;
			default : throw new PokerException("Wrong card value");
			}
		}
		else
			fullCardName = String.format("%d of %s", value, color);
	}
	
	/*
	 * Method for getting full card name, e.g. "5 of clubs"
	 */
	public String getFullCardName(){
		return fullCardName;
	}
	/*
	 * Method for getting card value
	 */
	public int getCardValue(){
		return this.value; 
	}
	/*
	 * Method for getting card color(suit)
	 */
	public String getCardColor(){
		return this.color;
	}
}
