package racingcar;

import java.util.ArrayList;
import java.util.List;

public class CarRepositoryImpl implements CarRepository {
    private List<Car> cars = new ArrayList<>();

    @Override
    public List<Car> getCarList() {
        return cars;
    }

    @Override
    public void addCar(Car car) {
        cars.add(car);
    }
}
