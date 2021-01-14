package racingcar;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        Game game = Game.createGame(new InputManager(scanner));
        if (game == null) return;
        game.start();
    }
}
