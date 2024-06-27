package pe.goblin.chess.game.converter;

import pe.goblin.chess.board.vo.Position;
import pe.goblin.chess.common.converter.Converter;

import java.util.regex.Pattern;

public class PositionConverter implements Converter<String, Position> {
    private final Pattern pattern = Pattern.compile("^[A-Za-z]+\\\\d+$");
    private final CharacterAxisConverter characterAxisConverter = new CharacterAxisConverter();
    private final IntegerAxisConverter integerAxisConverter = new IntegerAxisConverter();

    @Override
    public Position convert(String source) {
        if (source == null || !pattern.matcher(source).matches()) {
            throw new IllegalArgumentException("Empty position");
        }
        int firstDigitIndex = 0;
        for (int i = 0; i < source.length(); i++) {
            if (Character.isDigit(source.charAt(i))) {
                firstDigitIndex = i;
                break;
            }
        }
        String row = source.substring(0, firstDigitIndex);
        String column = source.substring(firstDigitIndex);
        return new Position(characterAxisConverter.convert(row), integerAxisConverter.convert(column));
    }
}
