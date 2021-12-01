package com.company.trains;

public class Household extends Train {

    @Override
    public void transportation(Object cargo, String destination) {
        System.out.println(
                useUpFuel(13) ?
                        String.format("Транспортируем груз %s в %s\n", cargo, destination)
                        : "Не хватает дизельного топлива");
    }

    @Override
    public void toGo(String destination) {
        System.out.println(
                useUpFuel(8) ?
                        "Отправились в " + destination : "Не хватает дизельного топлива");
    }

    @Override
    public void transfer(Object cargo, String destination) {

    }

}
