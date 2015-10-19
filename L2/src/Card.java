public class Card {
	private int value;
	private String color;
	private String fullCardName;
	
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
	
	
	public String GetFullCardName(){
		return fullCardName;
	}
	
	public int GetCardValue(){
		return this.value; 
	}
	
	public String GetCardColor(){
		return this.color;
	}
}
