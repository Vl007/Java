package com.company.types_of_trains;

public class Train {

    private int tonnage;
    private final int cargoCapacityVan;
    private final int addVan;


    public Train(int cargoCapacityVan, int addVan) {
        this.cargoCapacityVan = cargoCapacityVan;
        this.addVan = addVan;
    }

    public void transportation(Object cargo, String destination) {

        if (tonnage < cargoCapacityVan) {
            System.out.println("Осуществить транспортировку невозможно, не достаточно места!");
            return;
        }
        System.out.printf("Осуществляю перевозку %s в %s\n", cargo, destination);
        tonnage -= cargoCapacityVan;
    }

    public void addFraightWagon(int wagon) {
        tonnage += wagon;
        if (tonnage > addVan) tonnage = addVan;
        System.out.println("Увеличили грузоподьемность на " + wagon + " вагон(ов)");
    }

}
