package pe.goblin.chess.board;

import pe.goblin.chess.board.type.Type;
import pe.goblin.chess.board.vo.Position;
import pe.goblin.chess.piece.Piece;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Board {
    private final Type type;
    private Map<Position, Piece> pieces;

    public Board(Type type) {
        this.type = type;
        this.pieces = createEmptyBoard();
    }

    private Map<Position, Piece> createEmptyBoard() {
        Map<Position, Piece> initialPieces = new HashMap<>();
        for (int row = 0; row < type.getRowSize(); row++) {
            for (int col = 0; col < type.getColSize(); col++) {
                initialPieces.put(new Position(row, col), Piece.createBlank());
            }
        }
        return initialPieces;
    }

    public void initiate() {
        Map<Position, Piece> initialPieces = new HashMap<>();
        String[] initialState = type.getInitialState();
        for (int row = 0; row < type.getRowSize(); row++) {
            for (int col = 0; col < type.getColSize(); col++) {
                Piece piece = Piece.of(initialState[row].charAt(col));
                initialPieces.put(new Position(row, col), piece);
            }
        }
        this.pieces = initialPieces;
    }

    public List<Position> searchMovable(Position position) {
        return null;
    }

    public List<Position> searchAttackable(Position position) {
        return null;
    }
}
