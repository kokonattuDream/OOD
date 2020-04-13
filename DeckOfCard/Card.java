
public abstract class Card {
	private boolean available;
	protected int value;
	protected Suit suit;
	
	public Card(int value, Suit suit){
		available = true;
		this.value = value;
		this.suit = suit;
	}
	
	public abstract int value();
	
	public Suit suit(){
		return suit;
	}
	
	public boolean isAvailable(){
		return available;
	}
	
	public void setAvailable(boolean available){
		this.available = available;
	}
}
