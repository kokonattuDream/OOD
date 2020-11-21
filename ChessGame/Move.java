public class Move {
    private Player player;
    private Spot start;
    private Spot end;
    private Piece pieceMoved;
    private Piece pieceKilled;

    public Move(Player player, Spot start, Spot end){
        this.start = start;
        this.end = end;
        this.player = player;
    }
    public void setPieceMoved(Piece piece){
        pieceMoved = piece;
    }
    public void setPieceKilled(Piece piece){
        pieceKilled = piece;
    }
    public Piece getStartPiece(){
        return start.getPiece();
    }
    public Piece getDestPiece(){
        return end.getPiece();
    }

    public Spot getEndSpot(){
        return end;
    }
    public Spot getStartSpot(){
        return start;
    }
}
