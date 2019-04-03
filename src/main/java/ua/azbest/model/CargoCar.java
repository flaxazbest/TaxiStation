package ua.azbest.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CargoCar extends Vehicle {
    protected final double maxWeight = .0;
    protected double currentWeight = 0;

    public double addCargo(double weight) {
        if (currentWeight == maxWeight) // no load
            return weight;
        if (weight <= (maxWeight - currentWeight)) { // full load
            currentWeight += weight;
            return 0;
        }
        weight -= maxWeight - currentWeight; // partial load
        currentWeight = maxWeight;
        return weight;
    }


}
