package com.solfugaSoft.implementation;

import com.solfugaSoft.templates.IVehicleFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class VehicleFactory implements IVehicleFactory {
    @Value("Best Bike Factory (BBF)")
    private String name;

    @Autowired
    private PocketBike  pocketBike;

    private static List<Vehicle> vehicleList;
    static {
        vehicleList = new ArrayList<Vehicle>();
    }

    public String getFactoryName() {
        return name;
    }

    public VehicleFactory() {
    }

    public static void addOneVechicle(Vehicle vehicle) {
        vehicleList.add(vehicle);
    }

    public void createRandomVechicle() {
//        for (int i = 0; i < 5; i++) {
//            addOneVechicle(new PocketBike("MyPocketBike"));
//            System.out.println(vehicleList);
//        }
    }

    public PocketBike getPocketBike() {
        return pocketBike;
    }
}
