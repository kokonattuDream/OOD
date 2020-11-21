public class Spot{
    private Piece piece;
    private int x;
    private int y;

    public Spot(int x, int y, Piece piece){
        this.x = x;
        this.y = y;
        this.piece = piece;
    }

    public void setPiece(Piece piece){
        this.piece = piece;
    }

    public Piece getPiece(){
        return piece;
    }


}