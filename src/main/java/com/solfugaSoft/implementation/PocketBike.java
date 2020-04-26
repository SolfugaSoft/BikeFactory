package com.solfugaSoft.implementation;

import com.solfugaSoft.templates.EEngine;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class PocketBike {
    @Value("CC125")
    private EEngine eEngine;
    @Value("Small bike")
    private String name;

    public PocketBike() {
    }

    public PocketBike(String name) {
        this.seteEngine();
    }

    public void seteEngine() {

        int r = new Random().nextInt(2);
        System.out.println();
        if (r == 0) {
            this.eEngine = EEngine.CC50;
        }
        if (r == 1) {
            this.eEngine = EEngine.CC125;
        }
    }


    public EEngine geteEngine() {
        return eEngine;
    }

    public void seteEngine(EEngine eEngine) {
        this.eEngine = eEngine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PocketBike{" + "name " + name +
                ", eEngine=" + geteEngine() +
                '}';
    }
}
