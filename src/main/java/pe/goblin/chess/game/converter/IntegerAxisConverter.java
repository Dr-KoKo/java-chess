package pe.goblin.chess.game.converter;

import pe.goblin.chess.common.converter.Converter;

public class IntegerAxisConverter implements Converter<String, Integer> {
    @Override
    public Integer convert(String source) {
        return Integer.parseInt(source);
    }
}
