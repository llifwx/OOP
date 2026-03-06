package Chess_pieces;

public class Knight extends Piece {

    public Knight(Position a) {
        super(a);
    }

    @Override
    public boolean isLegalMove(Position b) {
        int rowDiff = Math.abs(a.getRow() - b.getRow());
        int colDiff = Math.abs(a.getCol() - b.getCol());

        return (rowDiff == 2 && colDiff == 1) || (rowDiff == 1 && colDiff == 2);
    }
}
