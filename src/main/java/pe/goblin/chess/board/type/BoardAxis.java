package pe.goblin.chess.board.type;

import java.util.List;

public enum BoardAxis {
    NUMERIC_AXIS(List.of(1, 2, 3, 4, 5, 6, 7, 8), Integer.class), ALPHABETIC_AXIS(List.of('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'), Character.class);


    private final List<?> axis;
    private final Class<?> axisClass;

    BoardAxis(List<?> axis, Class<?> axisClass) {
        this.axis = axis;
        this.axisClass = axisClass;
    }

    public List<?> getAxis() {
        return axis;
    }

    public Class<?> getAxisClass() {
        return axisClass;
    }
}
