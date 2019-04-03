package ua.azbest.model;

import lombok.Data;
import ua.azbest.model.comparators.AverageSpeedComparator;

import java.util.Set;
import java.util.TreeSet;

@Data
public class TaxiStation {

    private Set<Vehicle> carSet = null;

    public TaxiStation() {
        carSet = new TreeSet<Vehicle>(new AverageSpeedComparator());
    }

    public double getCost() {
        double result = .0;
        for (Vehicle car: carSet) {
            result += car.getCost();
        }
        return result;
    }

    public boolean addCar(Vehicle car) {
        return carSet.add(car);
    }

}
