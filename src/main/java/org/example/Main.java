package org.example;

import java.awt.*;

public class Main {
    public static void main(String[] args) {

        Harvester car1 = new Harvester("Scania", "R280", Color.white);
        SportCar car2 = new SportCar("Porshe", "911", Color.yellow);

        Refueling fuelStation = new RefulingStation();
        Wiping wipingStation = new WipingStation();

        car1.setRefuelingStation(fuelStation);
        car2.setWipingStation(wipingStation);

        car1.fuel();

        car2.wipMirrors();
        car2.wipWindShield();
        car2.wipHeadLights();
    }
}