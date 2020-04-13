
public class BlackJackCard extends Card{
	
	public BlackJackCard(int value, Suit suit){
		super(value, suit);
	}

	@Override
	public int value() {
		if(isAce()){
			return 1;
		} else if(value >= 11 && value <= 13){
			return 10;
		} else {
			return value;
		}
	}
	
	public int minValue(){
		if(isAce()){
			return 1;
		} else {
			return value();
		}
	}
	
	public boolean isAce(){
		return value == 1;
	}
}
