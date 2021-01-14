package racingcar;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        Game game = createGame(scanner);
        game.start();
    }

    public static Game createGame(Scanner scanner) throws NumberFormatException {
        CarRepository repository = new CarRepositoryImpl();

        System.out.print("경주 할 자동차 이름(이름은 쉼표(,) 기준으로 구분) > ");
        String[] carNames = scanner.nextLine().split(",");
        System.out.println();

        System.out.print("시도할 회수 > ");
        int trial = Integer.parseInt(scanner.nextLine());
        System.out.println();

        for (String carName : carNames) {
            repository.addCar(new Car(carName));
        }

        return new Game(repository, trial);
    }
}
