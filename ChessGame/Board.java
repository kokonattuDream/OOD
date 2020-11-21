public class Board {
    Spot[][] boxes;
    public Board(){
        resetBoard();
    }

    public void resetBoard(){

    }

    public Spot getBox(int x, int y){
        return boxes[x][y];
    }
}
