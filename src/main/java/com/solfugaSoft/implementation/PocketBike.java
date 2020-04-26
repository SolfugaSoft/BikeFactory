package com.solfugaSoft.implementation;

import com.solfugaSoft.templates.EColor;
import com.solfugaSoft.templates.EEngine;

import java.util.Random;

public class PocketBike extends Vehicle {

    private EEngine eEngine;

    public PocketBike(String name) {
        super(name);
        this.seteEngine();
    }
    @Override
    public void seteColor() {
        super.seteColor();
    }

    public void seteEngine() {

        int r = new Random().nextInt(2);
        System.out.println();
        if (r==0) {
            this.eEngine = EEngine.CC50;
        }
        if (r==1) {
            this.eEngine = EEngine.CC125;
        }
    }
    @Override
    public String toString() {
        return "PocketBike{" +
                "name='" + getName()+ '\'' +
                ", eEngine=" + eEngine +
                '}';
    }
}
