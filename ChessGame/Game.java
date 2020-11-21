import java.util.List;

public class Game {
    private Player[] players;
    private Board board;
    private Player currentTurn;
    private GameStatus status;
    private List<Move> moves;

    public void initialize(Player p1, Player p2){
        players = new Player[2];
        players[0] = p1;
        players[1] = p2;

        board.resetBoard();
        if(p1.getColor() == Color.WHITE){
            currentTurn = p1;
        } else {
            currentTurn = p2;
        }
        moves.clear();
    }
    public boolean isEnd(){
        return this.status != GameStatus.ACTIVE;
    }
    public void setStatus(GameStatus status){
        this.status = status;
    }

    public boolean playerMove(Player player, int startX, int startY, int endX, int endY){
        Spot startBox = board.getBox(startX, startY);
        Spot endBox = board.getBox(endX, endY);
        Move move = new Move(player, startBox, endBox);
        return this.makeMove(move, player);
    }

    public boolean makeMove(Move move, Player player){
        if(currentTurn != player){
            return false;
        }
        Piece sourcePiece = move.getStartPiece();
        if(sourcePiece == null){
            return false;
        }
        if(sourcePiece.getColor() != player.getColor()){
            return false;
        }
        if(!sourcePiece.ValidNextPos(move.getStartSpot(), move.getEndSpot())){
            return false;
        }
        
        Piece destPiece = move.getDestPiece();
        if(destPiece != null){
            destPiece.setKilled();
            move.setPieceKilled(destPiece);
        }
        moves.add(move);
        move.getEndSpot().setPiece(sourcePiece);
        move.getStartSpot().setPiece(null);

        if(destPiece != null && destPiece instanceof King){
            if(player.getColor() == Color.WHITE){
                this.setStatus(GameStatus.WHITE_WIN);
            } else {
                this.setStatus(GameStatus.BLACK_WIN);
            }
        } else {
            if(this.currentTurn == players[0]){
                this.currentTurn = players[1];
            } else {
                this.currentTurn = players[0];
            }
        }
        return true;
    }


}
