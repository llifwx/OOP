package Chess_pieces;

public class Bishop extends Piece {

    public Bishop(Position a) {
        super(a);
    }

    @Override
    public boolean isLegalMove(Position b) {
        return Math.abs(a.getRow() - b.getRow()) == Math.abs(a.getCol() - b.getCol());
    }
}
