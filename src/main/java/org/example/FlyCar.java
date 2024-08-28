package org.example;

import java.awt.*;

public class FlyCar extends Car{
    public FlyCar(String mark, String model, Color color) {
        super(mark, model, color);
        setWheelsCount(4);
    }

    @Override
    public void movement() {
        fly();
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

    public void fly(){
        System.out.println("Автомобиль летит!");
    }
}
