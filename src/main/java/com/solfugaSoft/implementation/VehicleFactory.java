package com.solfugaSoft.implementation;

import com.solfugaSoft.templates.IVehicleFactory;

import java.util.ArrayList;
import java.util.List;

public class VehicleFactory implements IVehicleFactory {
    private String name;
    private static List<Vehicle> vehicleList;

    static {
        vehicleList = new ArrayList<Vehicle>();
    }

    public String getFactoryName() {
        return name;
    }

    public static void addOneVechicle(Vehicle vehicle) {
        vehicleList.add(vehicle);
    }

    public void createRandomVechicle() {
        for (int i = 0; i <5 ; i++) {
            addOneVechicle(new PocketBike("MyPocketBike"));
            System.out.println(vehicleList);
        }


    }
}
