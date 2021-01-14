package racingcar;

import java.util.ArrayList;
import java.util.List;

public class CarRepository {
    private List<Car> cars;

    public CarRepository() {
        cars = new ArrayList<>();
        cars.add(new Car(""));
    }
}
