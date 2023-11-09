package web.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.Arrays;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CarServiceImpl implements CarService {

    private final List<Car> cars = Arrays.asList(
            new Car("One", "Car1", 1),
            new Car("Two", "Car2", 2),
            new Car("Three", "Car3", 3),
            new Car("Four", "Car4", 4),
            new Car("Five", "Car5", 5)
    );

    @Override
    public List<Car> getAllCars(int count) {
        if (count < 1 || count > cars.size()) {
            count = cars.size();
        }
        return cars.subList(0, count);
    }
}
