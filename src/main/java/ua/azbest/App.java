package ua.azbest;

import ua.azbest.dispatcher.TaxiWriter;
import ua.azbest.model.*;

public class App {

    public static void main(String[] args) {
        Vehicle car1 = new CommonCar();
        Vehicle car2 = new CargoCar();

        TaxiStation taxiStation = new TaxiStation();
        taxiStation.getCarSet().add(car1);
        car1.setAverageSpeed(20);
        taxiStation.getCarSet().add(car2);
        car2.setAverageSpeed(20);

        System.out.println(taxiStation.getCarSet().size());

        TaxiWriter.saveToJsonFile(taxiStation, "taxi.json");
    }

}
