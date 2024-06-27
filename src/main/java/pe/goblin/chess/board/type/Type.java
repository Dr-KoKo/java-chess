package pe.goblin.chess.board.type;

public enum Type {
    CLASSIC(8, 8,
            new String[]{
                    "RNBQKBNR",
                    "PPPPPPPP",
                    "........",
                    "........",
                    "........",
                    "........",
                    "pppppppp",
                    "rnbqkbnr"
            });

    private final int rowSize;
    private final int colSize;
    private final String[] initialState;

    Type(int rowSize, int colSize, String[] initialState) {
        this.rowSize = rowSize;
        this.colSize = colSize;
        this.initialState = initialState;
    }

    public int getRowSize() {
        return rowSize;
    }

    public int getColSize() {
        return colSize;
    }

    public String[] getInitialState() {
        return initialState;
    }
}
