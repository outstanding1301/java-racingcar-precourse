package racingcar;

import java.util.List;
import java.util.stream.Collectors;

public class Game {
    private CarRepository repository;
    private int trial;

    public Game(CarRepository repository, int trial) {
        this.repository = repository;
        this.trial = trial;
    }

    public int getTrial() {
        return trial;
    }

    public void trying() {
        for (Car car : repository.getCarList()) {
            car.move();
        }
    }

    public void printStatus() {
        for (Car car : repository.getCarList()) {
            System.out.printf("%s : %s\n", car.getName(), car.getPositionString());
        }
    }

    public List<Car> getWinner() {
        return repository.getWinner();
    }

    public void start() {
        System.out.println("실행 결과");
        for (int i=0; i<trial; i++) {
            trying();
            printStatus();
            System.out.println();
        }
        String winner = String.join(", ", getWinner().stream().map(c -> c.getName()).collect(Collectors.toList()));
        System.out.println("최종 우승자 : " + winner);
    }
}
