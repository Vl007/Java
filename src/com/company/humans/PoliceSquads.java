package com.company.humans;

public class PoliceSquads extends Human {

    @Override
    public void transportation(Object cargo, String destination) {
        System.out.println("Я занимаюсь обеспечением порядка и безопасноти в поезде!");
    }

    @Override
    public void ticketVerification(int ticket) {

    }

    @Override
    public void go(String destination) {
        System.out.println("Едем в " + destination);
    }
}
