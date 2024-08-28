package org.example;

import java.awt.*;

public class SportCar extends Car implements Washing{

    private Wiping wipingStation;

    public SportCar(String mark, String model, Color color) {
        super(mark, model, color);
        setWheelsCount(3);
    }

    public void setWipingStation(Wiping wipingStation) {
        this.wipingStation = wipingStation;
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

    @Override
    public void wipMirrors() {
        if (wipingStation != null){
            wipingStation.wipMirrors();
        }
    }

    @Override
    public void wipWindShield() {
        if (wipingStation != null){
            wipingStation.wipWindShield();
        }
    }

    @Override
    public void wipHeadLights() {
        if (wipingStation != null){
            wipingStation.wipHeadLights();
        }
    }
}
