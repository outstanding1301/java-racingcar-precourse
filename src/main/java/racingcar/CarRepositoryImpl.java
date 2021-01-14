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

    @Override
    public List<Car> getWinner() {
        List<Car> res = new ArrayList<>();
        int max = Integer.MIN_VALUE;

        for (Car car : cars) {
            if (car.getPosition() >= max) {
                if (car.getPosition() > max) {
                    res.clear();
                }
                max = car.getPosition();
                res.add(car);
            }
        }
        return res;
    }
}
