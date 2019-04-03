package ua.azbest.model.comparators;

import ua.azbest.model.Vehicle;

import java.util.Comparator;

public class FuelConsumptionComparator implements Comparator<Vehicle> {
    public int compare(Vehicle o1, Vehicle o2) {
        return ((Double)(o1.getFuelConsumption())).compareTo(o2.getFuelConsumption());
    }
}
