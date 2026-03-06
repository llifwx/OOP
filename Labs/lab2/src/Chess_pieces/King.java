package Chess_pieces;

public class King extends Piece {

    public King(Position a) {
        super(a);
    }

    @Override
    public boolean isLegalMove(Position b) {
        int rowDiff = Math.abs(a.getRow() - b.getRow());
        int colDiff = Math.abs(a.getCol() - b.getCol());

        return rowDiff <= 1 && colDiff <= 1 && !(rowDiff == 0 && colDiff == 0);
    }
}
