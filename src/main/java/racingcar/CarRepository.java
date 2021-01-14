package racingcar;

import java.util.List;

public interface CarRepository {
    List<Car> getCarList();
    void addCar(Car car);
}
