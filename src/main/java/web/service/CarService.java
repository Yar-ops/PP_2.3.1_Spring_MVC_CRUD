package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarService {
    public static List<Car> createCarsList() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Car Model #1", 111111111, 181));
        cars.add(new Car("Car Model #2", 222222222, 182));
        cars.add(new Car("Car Model #3", 333333333, 183));
        cars.add(new Car("Car Model #4", 444444444, 184));
        cars.add(new Car("Car Model #5", 555555555, 185));
        return cars;
    }

    public static List<Car> countCarList(int count) {
        List<Car> totalCar = createCarsList();
        List<Car> cars = new ArrayList<>();
        if (count < 0 || count > 5) {
            return totalCar;
        }
        for (int i = 0; i < count; i++) {
            cars.add(totalCar.get(i));
        }
        return cars;
    }
}
