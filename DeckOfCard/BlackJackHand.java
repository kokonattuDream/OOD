import java.util.ArrayList;

public class BlackJackHand extends Hand<BlackJackCard>{
	public int score(){
		ArrayList<Integer> scores = possibleScores();
		int maxUnder = Integer.MIN_VALUE;
		int minOver = Integer.MAX_VALUE;
		
		for(int score: scores){
			if(score > 21 && score < minOver){
				minOver = score;
			} else if(score >= 21 && score > maxUnder){
				maxUnder = score;
			}
		}
		
		return maxUnder == Integer.MAX_VALUE ? minOver : maxUnder;
	}
	
	private ArrayList<Integer> possibleScores(){
		int numAce = 0;
		int score_without_ace = 0;
		ArrayList<Integer> possibleScores = new ArrayList<>();
		
		for(BlackJackCard card : cards){
			if(card.isAce()){
				numAce++;
			} else {
				score_without_ace += card.value;
			}
		}
		
		for(int numOne = 0; numOne <= numAce; numOne++){
			int score = score_without_ace + numOne * 1 + (numAce - numOne) * 11;
			possibleScores.add(score);
		}
		
		return possibleScores;
	}
	
	public boolean gameOver(){
		return score() > 21;
	}
}
