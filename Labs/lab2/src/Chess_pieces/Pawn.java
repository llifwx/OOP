package Chess_pieces;

public class Pawn extends Piece {

    public Pawn(Position a) {
        super(a);
    }

    @Override
    public boolean isLegalMove(Position b) {
        return b.getCol() == a.getCol() && b.getRow() == a.getRow() + 1;
    }
}
