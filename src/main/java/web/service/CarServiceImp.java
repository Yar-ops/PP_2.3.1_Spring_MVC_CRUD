package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImp implements CarService {

    private final List<Car> totalCars;

    @Autowired
    public CarServiceImp() {
        this.totalCars = new ArrayList<>();
        this.totalCars.add(new Car("Car Model #1", 111111111, 181));
        this.totalCars.add(new Car("Car Model #2", 222222222, 182));
        this.totalCars.add(new Car("Car Model #3", 333333333, 183));
        this.totalCars.add(new Car("Car Model #4", 444444444, 184));
        this.totalCars.add(new Car("Car Model #5", 555555555, 185));
    }

    @Override
    public List<Car> countCarList(int count) {
        List<Car> cars = new ArrayList<>();
        if (count < 0 || count > 5) {
            return cars;
        }
        for (int i = 0; i < count; i++) {
            cars.add(totalCars.get(i));
        }
        return cars;
    }
}
