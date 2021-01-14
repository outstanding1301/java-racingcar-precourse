package racingcar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.stream.Collectors;

class ApplicationTest {
    Game game;

    @BeforeEach
    void inputTest() {
        CarRepository repository = new CarRepositoryImpl();

        System.out.print("경주 할 자동차 이름(이름은 쉼표(,) 기준으로 구분) > ");
        String carNamesStr = "pobi,woni,jun";
        System.out.println();
        String[] carNames = carNamesStr.split(",");

        System.out.print("시도할 회수 > ");
        String trialStr = "5";
        System.out.println();

        int trial = Integer.parseInt(trialStr);

        for (String carName : carNames) {
            repository.addCar(new Car(carName));
        }

        game = new Game(repository, trial);
    }

    @Test
    void racingTest() {
        for (int i=0; i<game.getTrial(); i++) {
            game.trying();
            game.printStatus();
            System.out.println();
        }
        String winner = String.join(",", game.getWinner().stream().map(c -> c.getName()).collect(Collectors.toList()));
        System.out.println(winner);
    }
}