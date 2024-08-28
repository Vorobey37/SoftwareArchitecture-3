package org.example;

public class RefulingStation implements Refueling{
    @Override
    public void fuel(FuelType fuelType) {

        switch (fuelType){
            case Diesel -> System.out.println("Заправка дизельным топливом");
            case Gasoline -> System.out.println("Заправка бензином");
        }

    }
}
