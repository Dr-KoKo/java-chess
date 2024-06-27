package pe.goblin.chess.piece;

public enum Type {
    PAWN('p'), ROOK('r'), KNIGHT('n'), BISHOP('b'), QUEEN('q'), KING('k'), NO_PIECE('.');

    private final char representation;

    Type(char representation) {
        this.representation = representation;
    }

    public char getRepresentation() {
        return representation;
    }

    public static Type valueOf(char ch) {
        for (Type type : Type.values()) {
            if (Character.toLowerCase(ch) == type.getRepresentation()) {
                return type;
            }
        }
        throw new IllegalArgumentException("Invalid piece type: " + ch);
    }
}
