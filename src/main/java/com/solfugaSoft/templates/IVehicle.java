package com.solfugaSoft.templates;

import com.solfugaSoft.implementation.Vehicle;

public interface IVehicle {

    public String getName();
    public EColor getEColor();
    public EEngine getEEngine();
    public String toString();
    public void autoAdding(Vehicle vehicle);

}
