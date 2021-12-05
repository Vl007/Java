package com.company.trains;

import com.company.TransportationFormatException;

public class Cargo extends Train {

    @Override
    public void transportation(Object cargo, String destination){
        if (!destination.matches("[a-zA-Z_-]+")) {
            throw new TransportationFormatException(destination);
        }
        System.out.println(
                useUpFuel(10) ?
                        String.format("Транспортируем груз %s в %s\n", cargo, destination)
                        : "Не хватает дизельного топлива");
    }

    @Override
    public void toGo(String destination) {
        System.out.println(
                useUpFuel(7) ?
                        "Отправились в " + destination : "Не хватает дизельного топлива");
    }

    @Override
    public void transfer(Object cargo, String destination) {

    }

}
