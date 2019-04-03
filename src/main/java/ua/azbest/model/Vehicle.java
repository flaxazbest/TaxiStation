package ua.azbest.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Vehicle implements Serializable {

    protected TaxiStation taxiStation;
    protected double cost;
    protected double fuelConsumption;
    protected int averageSpeed;
}
