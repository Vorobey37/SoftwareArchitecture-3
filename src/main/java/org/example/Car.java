package org.example;

import java.awt.*;

public abstract class Car {

    private String mark;
    private String model;
    private Color color;
    private int wheelsCount;
    protected CarType carType;
    protected FuelType fuelType;
    private GearBoxType gearBoxType;
    private double engineCapacity;
    private boolean fogLights = false;



    public Car(String mark, String model, Color color) {
        this.mark = mark;
        this.model = model;
        this.color = color;
    }

    protected void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public abstract void movement();
    public abstract void maintenance();
    public abstract boolean gearShifting();
    public abstract boolean switchHeadLights();
    public abstract boolean switchWipers();
    public boolean switchFogLights(){
        fogLights = !fogLights;
        return fogLights;
    }
    protected void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }
    public int getWheelsCount() {
        return wheelsCount;
    }
}
