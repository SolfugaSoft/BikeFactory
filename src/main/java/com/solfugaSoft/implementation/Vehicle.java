package com.solfugaSoft.implementation;

import com.solfugaSoft.templates.EColor;
import com.solfugaSoft.templates.EEngine;
import com.solfugaSoft.templates.IVehicle;

import java.util.Random;

public abstract class Vehicle implements IVehicle {

    private String name;
    private EColor eColor;
    private EColor[] eColorList = EColor.values();
    private EEngine eEngine;
    private EEngine[] eEngineList = EEngine.values();


    public Vehicle(String name) {
        this.name = name;
        autoAdding(this);
    }


    public String getName() {
        return name;
    }

    public EColor getEColor() {
        return eColor;
    }

    public EEngine getEEngine() {
        return eEngine;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void seteColor() {
        this.eColor = eColorList[new Random().nextInt(eColorList.length)];
    }

    public void seteEngine(EEngine eEngine) {
        this.eEngine = eEngine;
    }

    public void seteEngine() {
    }

    public void autoAdding(Vehicle vehicle) {
        VehicleFactory.addOneVechicle(vehicle);
    }


}
