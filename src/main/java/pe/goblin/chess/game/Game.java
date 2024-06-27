package pe.goblin.chess.game;

import pe.goblin.chess.board.AvailableMoves;
import pe.goblin.chess.board.Board;
import pe.goblin.chess.board.ScoreCalculator;
import pe.goblin.chess.board.vo.Position;
import pe.goblin.chess.common.converter.Converter;

import java.util.List;

public class Game {
    private final Board board;
    private final Converter<String, Position> positionConverter;
    private final ScoreCalculator scoreCalculator;

    public Game(Board board, Converter<String, Position> positionConverter, ScoreCalculator scoreCalculator) {
        this.board = board;
        this.positionConverter = positionConverter;
        this.scoreCalculator = scoreCalculator;
    }

    public void start() {
        board.initiate();
    }

    public AvailableMoves select(String input) throws InvalidRequestException {
        Position position = positionConverter.convert(input);
        List<Position> movables = board.searchMovable(position);
        List<Position> attackables = board.searchAttackable(position);
        return new AvailableMoves(movables, attackables);
    }

    public void move(String input) throws InvalidRequestException {

        evaluate();
    }

    private void evaluate() {
        int score = scoreCalculator.calculate(board);
    }

    public void end() throws InvalidRequestException {

    }
}
