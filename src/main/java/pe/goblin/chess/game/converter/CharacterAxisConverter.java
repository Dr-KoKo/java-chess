package pe.goblin.chess.game.converter;

import pe.goblin.chess.common.converter.Converter;

public class CharacterAxisConverter implements Converter<String, Integer> {
    @Override
    public Integer convert(String source) {
        if (source == null || source.isEmpty()) {
            throw new IllegalArgumentException("Input string cannot be null or empty");
        }
        int result = 0;
        int len = source.length();
        for (int idx = 0; idx < len; idx++) {
            char ch = source.charAt(len - 1 - idx);
            int value = ch - 'a' + 1;
            result += (int) (value * Math.pow(26, idx));
        }
        return result - 1;
    }
}
