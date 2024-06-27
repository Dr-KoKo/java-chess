package pe.goblin.chess.game;

import java.util.List;
import java.util.regex.Pattern;

public class CommandParser {
    private final Game game;
    private final List<Pattern> commandPatterns;

    public CommandParser(Game game, List<Pattern> commandPatterns) {
        this.game = game;
        this.commandPatterns = commandPatterns;
    }

}
