package pe.goblin.chess.board;

import pe.goblin.chess.board.vo.Position;

import java.util.List;

public record AvailableMoves(List<Position> movable, List<Position> attackable) {
}
