package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {
    private List<Car> cars;

    @Override
    public List<Car> getCars(int count) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("mod1", 1, "col1"));
        cars.add(new Car("mod2", 2, "col2"));
        cars.add(new Car("mod3", 3, "col3"));
        cars.add(new Car("mod4", 4, "col4"));
        cars.add(new Car("mod5", 5, "col5"));
        if (count >= 5) {
            return cars;
        } else {
            return cars.subList(0, count);
        }
    }
}