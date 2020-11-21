
public abstract class Piece {
    private Color color;
    private boolean killed;

    public Piece(Color color){
        this.color = color;
    }

    public boolean isKilled(){
        return killed;
    }

    public Color getColor(){
        return color;
    }

    public void setKilled(){
        killed = true;
    }

    public abstract boolean ValidNextPos(Spot start, Spot end);

}
