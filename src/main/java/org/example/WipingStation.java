package org.example;

public class WipingStation implements Wiping{


    @Override
    public void wipMirrors() {
        System.out.println("Мойка зеркал");
    }

    @Override
    public void wipWindShield() {
        System.out.println("Мойка стекла");
    }

    @Override
    public void wipHeadLights() {
        System.out.println("Мойка фар");
    }
}
