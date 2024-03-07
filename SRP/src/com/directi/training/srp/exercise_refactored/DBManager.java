package com.directi.training.srp.exercise_refactored;

import java.util.Arrays;
import java.util.List;

public class DBManager {

    public List<Car> getFakeApi(){
        return Arrays
        .asList(new Car("1", "Golf III", "Volkswagen"), new Car("2", "Multipla", "Fiat"),
            new Car("3", "Megane", "Renault"));
    }

    public Car getFromDb(final String carId, List<Car> cars )
    {
        for (Car car : cars ) {
            if (car.getId().equals(carId)) {
                return car;
            }
        }
        return null;
    }
}
