public class Puzzle{
    private Piece[][] solution;
    private LinkedList<Piece> pieces;
    private int size;

    public Puzzle(int size, LinkedList pieces){
        this.pieces = pieces;
        this.size = size;
    }

    private void setEdgeInSolution(LinkedList<Piece> pieces, Edge edge, int row,
        int column, Orientation orientation){

        Piece piece = edge.getParentPiece();
        piece.setEdgeAsOrientation(edge, orientation);
        pieces.remove(piece);
        solution[row][column] = piece;
    }

    private boolean fitNextEdge(LinkedList<Piece> piecesToSearch, int row, int col){
        if(row == 0 && column == 0){
            Piece p = piecesToSearch.remove();
            solution[0][0] = p;
        } else {
            Piece pieceToMatch = column == 0 ? solution[row-1][0] : solution[row][column-1];

            Orientation orientationToMatch = column == 0 ? Orientation.BOTTOM : Orientation.RIGHT;
            
            Edge edgeToMatch = pieceToMatch.getEdgeWithOrientation(orientationToMatch);
            Edge edge = getMatchingEdge(edgeToMatch, piecesToSearch);

            if (edge == nUll) return false;

            Orientation orientation =orientationToMatch.getOpposite();
            setEdgeInSolution(piecesToSearch, edge, row, column, orientation);
        }
    }
    public boolean solve(){
        LinkedList<Piece> cornerPieces = new LinkedList<>();
        LinkedList<Piece> borderPieces = new LinkedList<>();
        LinkedList<Piece> insiderPieces = new LinkedList<>();

        solution = new Piece[size][size];

        for(int row = 0; row < size; row++){
            for(int col = 0; col < size; col++){
                LinkedList<Piece> pieceToSearch = getPieceListToSearch(cornerPieces)
                if (!fitNextEdge(piecesToSearch, row, column) {
                    return false; 
                }
            }
        }
    }
}