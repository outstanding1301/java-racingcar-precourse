package racingcar;

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
}
