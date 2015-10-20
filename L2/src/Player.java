import java.util.ArrayList;
import java.util.List;

public class Player {
  
  private List<Card> hand = new ArrayList<Card>();
  public int PlayerID;
  public String PlayerName;
  
  public Player(int ID) {
    this.PlayerID = ID;
  }

  public List<Card> showHand(){
    return hand;
  }
  
  public void GiveCardsToPlayer(List<Card> hand){
    this.hand = hand;
  }
}
