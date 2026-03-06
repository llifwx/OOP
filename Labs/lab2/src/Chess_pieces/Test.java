package Chess_pieces;

public class Test {
    public static void main(String[] args) {
        Piece rook = new Rook(new Position(4, 4));
        System.out.println("Rook to (4,7): " + rook.isLegalMove(new Position(4, 7))); // true
        System.out.println("Rook to (6,6): " + rook.isLegalMove(new Position(6, 6))); // false

        Piece bishop = new Bishop(new Position(3, 3));
        System.out.println("Bishop to (5,5): " + bishop.isLegalMove(new Position(5, 5))); // true
        System.out.println("Bishop to (3,6): " + bishop.isLegalMove(new Position(3, 6))); // false

        Piece queen = new Queen(new Position(4, 4));
        System.out.println("Queen to (4,8): " + queen.isLegalMove(new Position(4, 8))); // true
        System.out.println("Queen to (7,7): " + queen.isLegalMove(new Position(7, 7))); // true

        Piece king = new King(new Position(5, 5));
        System.out.println("King to (6,6): " + king.isLegalMove(new Position(6, 6))); // true
        System.out.println("King to (7,7): " + king.isLegalMove(new Position(7, 7))); // false

        Piece knight = new Knight(new Position(4, 4));
        System.out.println("Knight to (6,5): " + knight.isLegalMove(new Position(6, 5))); // true
        System.out.println("Knight to (5,5): " + knight.isLegalMove(new Position(5, 5))); // false

        Piece pawn = new Pawn(new Position(2, 3));
        System.out.println("Pawn to (3,3): " + pawn.isLegalMove(new Position(3, 3))); // true
        System.out.println("Pawn to (4,3): " + pawn.isLegalMove(new Position(4, 3))); // false
    }
}