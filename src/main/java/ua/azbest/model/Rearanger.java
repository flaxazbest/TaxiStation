package ua.azbest.model;

import ua.azbest.model.comparators.FuelConsumptionComparator;

import java.util.Collections;
import java.util.List;

public class Rearanger {

    public static void sortCarListByFuelConsumptionACS(List<Vehicle> cars) {
        Collections.sort(cars, new FuelConsumptionComparator());
    }

}
