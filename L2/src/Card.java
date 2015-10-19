public class Card {
	private int value;
	private String color;
	private String fullCardName;
	/*
	 * constructor of class Card, which builds the fullCardName
	 */
	Card(int value, String color){
		this.value = value;
		this.color = color;
		if(value>10){
			switch(value){
			case 11: fullCardName = "Jack of " + color; 
			case 12: fullCardName = "Queen of " + color;
			case 13: fullCardName = "King of " + color;
			case 14: fullCardName = "Ace of " + color;
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
