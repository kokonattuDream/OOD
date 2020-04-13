import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck <T extends Card> {
	private ArrayList<T> cards;
	private ArrayList<T> remaining;
	
	public void setDeckOfCards(ArrayList<T> cards){
		this.cards = cards;
		remaining = new ArrayList<>(cards);
	}
	
	public void resetDeck(){
		remaining = new ArrayList<>(cards);
	}
	
	public void shuffle(){
		Random rand = new Random(); 
		int shuffleNum = rand.nextInt(remainingCards());
		int startIndex = rand.nextInt(remainingCards());
		
		int count = 0;
		int index = startIndex % remaining.size();
		
		while(count <= shuffleNum){
			T card = remaining.remove(index);
			cards.add(card);
			count++;
			index++;
		}
	}
	
	public int remainingCards(){
		return remaining.size();
	}
	
	public T handCard(){
		T card = null;
		
		card = remaining.remove(remaining.size() - 1);
		card.setAvailable(false);
		
		return card;
	}
}
