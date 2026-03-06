package Chess_pieces;

public class Rook extends Piece {

    public Rook(Position a) {
        super(a);
    }

    @Override
    public boolean isLegalMove(Position b) {
        return a.getRow() == b.getRow() || a.getCol() == b.getCol();
    }
}
