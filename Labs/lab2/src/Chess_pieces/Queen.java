package Chess_pieces;

public class Queen extends Piece {

    public Queen(Position a) {
        super(a);
    }

    @Override
    public boolean isLegalMove(Position b) {
        boolean rookMove = a.getRow() == b.getRow() || a.getCol() == b.getCol();
        boolean bishopMove = Math.abs(a.getRow() - b.getRow()) == Math.abs(a.getCol() - b.getCol());
        return rookMove || bishopMove;
    }
}
