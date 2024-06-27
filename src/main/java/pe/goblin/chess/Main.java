package pe.goblin.chess;

import pe.goblin.chess.board.Board;
import pe.goblin.chess.board.type.Type;
import pe.goblin.chess.game.Game;
import pe.goblin.chess.game.converter.PositionConverter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Goblin Chess");
        System.out.println("press start or end");
        Board board = new Board(Type.CLASSIC);
        PositionConverter positionConverter = new PositionConverter();
        Game game = new Game(board, positionConverter, );
        String command;
        while (true) {
            switch (command = scanner.nextLine()) {
                case "start":
                    game.start();
                    break;
                case "end":
                    game.end();
                    System.exit(0);
                    break;
                default:
                    if (command.startsWith("move")) {
                        game.move(command);
                        break;
                    } else {
                        System.out.println("Invalid command");
                    }
            }
        }
    }
}