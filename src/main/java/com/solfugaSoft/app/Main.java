package com.solfugaSoft.app;

import com.solfugaSoft.config.Config;
import com.solfugaSoft.implementation.PocketBike;
import com.solfugaSoft.implementation.VehicleFactory;
import com.solfugaSoft.templates.IVehicle;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Random;

public class Main {
    public static void main(String[] args) {


        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        IVehicle s = context.getBean(IVehicle.class);

        System.out.println(s);


    }
}
