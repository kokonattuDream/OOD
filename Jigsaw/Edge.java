public class Edge {
    private Shape shape;
    private Piece parentPiece;
    
    public Edge(Shape shape) {
        this.shape = shape;
    }
    public boolean fitsWith(Edge edge) { 

    }

    /**
     * @return Shape return the shape
     */
    public Shape getShape() {
        return shape;
    }

    /**
     * @param shape the shape to set
     */
    public void setShape(Shape shape) {
        this.shape = shape;
    }

    /**
     * @return Piece return the parentPiece
     */
    public Piece getParentPiece() {
        return parentPiece;
    }

    /**
     * @param parentPiece the parentPiece to set
     */
    public void setParentPiece(Piece parentPiece) {
        this.parentPiece = parentPiece;
    }

}