package com.solfugaSoft.app;

import com.solfugaSoft.config.AutoConfig;
import com.solfugaSoft.implementation.VehicleFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AutoConfig.class);

        VehicleFactory vehicleFactory = context.getBean(VehicleFactory.class);

        System.out.println(vehicleFactory.getPocketBike());

    }
}
