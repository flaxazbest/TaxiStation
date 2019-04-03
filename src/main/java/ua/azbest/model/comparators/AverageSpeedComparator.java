package ua.azbest.model.comparators;

import ua.azbest.model.Vehicle;

import java.util.Comparator;

public class AverageSpeedComparator implements Comparator<Vehicle> {
    public int compare(Vehicle o1, Vehicle o2) {
        return ((Integer)(o1.getAverageSpeed())).compareTo(o2.getAverageSpeed());
    }
}
