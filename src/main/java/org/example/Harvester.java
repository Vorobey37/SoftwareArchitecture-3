package org.example;

import java.awt.*;

public class Harvester extends Car implements Fueling{

    private Refueling refuelingStation;
    public Harvester(String mark, String model, Color color) {
        super(mark, model, color);
        setWheelsCount(6);
        setFuelType(FuelType.Diesel);
    }

    public void setRefuelingStation(Refueling refuelingStation) {
        this.refuelingStation = refuelingStation;
    }

    @Override
    public void movement() {

    }

    @Override
    public void maintenance() {

    }

    @Override
    public boolean gearShifting() {
        return false;
    }

    @Override
    public boolean switchHeadLights() {
        return false;
    }

    @Override
    public boolean switchWipers() {
        return false;
    }

    public void swiping(){
        System.out.println("Автомобиль подметает улицу");
    }

    @Override
    public void fuel() {
        if (refuelingStation != null){
            refuelingStation.fuel(fuelType);
        }
    }
}