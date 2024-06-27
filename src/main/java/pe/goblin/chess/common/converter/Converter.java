package pe.goblin.chess.common.converter;

public interface Converter<S, T> {
    T convert(S source);
}
