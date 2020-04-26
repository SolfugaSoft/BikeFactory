package com.solfugaSoft.config;

import com.solfugaSoft.implementation.PocketBike;
import com.solfugaSoft.implementation.VehicleFactory;
import com.solfugaSoft.templates.IVehicle;
import com.solfugaSoft.templates.IVehicleFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public IVehicle getVehicle (){
        return new PocketBike("mały motocykl");
    }

    @Bean
    public IVehicleFactory getIVehicleFactory(){
        return new VehicleFactory();
    }
}
