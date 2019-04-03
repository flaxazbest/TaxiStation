package ua.azbest.dispatcher;

import com.fasterxml.jackson.databind.ObjectMapper;
import ua.azbest.model.TaxiStation;
import ua.azbest.model.Vehicle;

import java.io.File;
import java.io.IOException;

public class TaxiWriter {

    public static void saveToJsonFile(TaxiStation taxiStation, String path) {

        ObjectMapper mapper = new ObjectMapper();
        File file = new File(path);
            try {
                mapper.writeValue(file, taxiStation);
            } catch (IOException e) {
                e.printStackTrace();
            }
    }

}
